package scheduler.payment.ui;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import scheduler.payment.service.PaymentService;
import scheduler.model.Deposit;
/**
 * PaymentHistoryUI - Displays all deposits in a table with statuses.
 * 
 * @author Amal Aden
 */
public class PaymentHistoryUI extends JFrame {
    
    // UI COMPONENTS
    private JTable historyTable;
    private DefaultTableModel tableModel;
    private JLabel summaryLabel;
    private PaymentService paymentService;
    
    // CONSTRUCTOR
    
    public PaymentHistoryUI() {
        this.paymentService = PaymentService.getInstance();
        
        // Setup window
        setTitle("York Room Booking - Payment History");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));
        setLocationRelativeTo(null);
        
        // TOP PANEL: Title
        JPanel topPanel = new JPanel();
        JLabel titleLabel = new JLabel("💰 Your Payment History");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        topPanel.add(titleLabel);
        add(topPanel, BorderLayout.NORTH);
        
        // CENTER PANEL: Table
        String[] columns = {"Deposit ID", "Booking ID", "Amount", "Payment Method", "Status"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        historyTable = new JTable(tableModel);
        historyTable.setRowHeight(30);
        historyTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        historyTable.getTableHeader().setBackground(new Color(200, 220, 240));
        historyTable.setSelectionBackground(new Color(220, 240, 255));
        
        JScrollPane scrollPane = new JScrollPane(historyTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // SOUTH PANEL: Summary + Buttons
        JPanel southPanel = new JPanel(new BorderLayout(10, 10));
        
        // Summary label
        summaryLabel = new JLabel("📊 Loading summary...");
        summaryLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        southPanel.add(summaryLabel, BorderLayout.WEST);
        
        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        // ============================================================
        // CHANGED: "Refresh" → "See Payment History"
        // ============================================================
        JButton seeHistoryButton = new JButton("📋 See Payment History");
        seeHistoryButton.setBackground(new Color(0, 120, 200));
        seeHistoryButton.setForeground(Color.WHITE);
        seeHistoryButton.setFont(new Font("Arial", Font.BOLD, 12));
        seeHistoryButton.addActionListener(e -> refreshTable());  // Reloads the data
        buttonPanel.add(seeHistoryButton);
        
        JButton closeButton = new JButton("✖ Close");
        closeButton.setBackground(new Color(200, 50, 50));
        closeButton.setForeground(Color.BLACK);
        closeButton.setFont(new Font("Arial", Font.BOLD, 12));
        closeButton.addActionListener(e -> dispose());
        buttonPanel.add(closeButton);
        
        southPanel.add(buttonPanel, BorderLayout.EAST);
        add(southPanel, BorderLayout.SOUTH);
        
        // LOAD DATA
        refreshTable();
        
        setVisible(true);
    }
    
    // REFRESH TABLE
    private void refreshTable() {
        // Clear table
        tableModel.setRowCount(0);
        
        // Get deposits from backend
        List<Deposit> deposits = paymentService.getDeposits();
        
        if (deposits == null || deposits.isEmpty()) {
            tableModel.addRow(new Object[]{"No deposits found", "", "", "", ""});
            summaryLabel.setText("📊 Total Deposits: $0.00 | No deposits yet");
            return;
        }
        
        // Add each deposit to table
        double totalAmount = 0;
        int appliedCount = 0;
        int forfeitedCount = 0;
        int pendingCount = 0;
        int refundedCount = 0;
        
        for (Deposit d : deposits) {
            tableModel.addRow(new Object[]{
                d.getDepositId(),
                d.getBookingId(),
                "$" + String.format("%.2f", d.getAmount()),
                d.getPaymentMethod() != null ? d.getPaymentMethod() : "N/A",
                d.getState() != null ? d.getState().getDisplayName() : "Unknown"
            });
            
            totalAmount += d.getAmount();
            if (d.getState() != null) {
                switch (d.getState()) {
                    case APPLIED: appliedCount++; break;
                    case FORFEITED: forfeitedCount++; break;
                    case PENDING: pendingCount++; break;
                    case REFUNDED: refundedCount++; break;
                    default: break;
                }
            }
        }
        
        summaryLabel.setText(String.format(
            "📊 Total Deposits: $%.2f | Applied: %d | Forfeited: %d | Pending: %d | Refunded: %d",
            totalAmount, appliedCount, forfeitedCount, pendingCount, refundedCount
        ));
    }
}