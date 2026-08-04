package scheduler.payment.ui;


import javax.swing.*;
import scheduler.payment.service.PaymentService;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import scheduler.payment.service.CheckInService;
import scheduler.payment.service.PaymentService;
import scheduler.model.Deposit;

/**
 * BookingStatusUI - Shows booking status with 30-minute countdown and check-in.
 * 
 * @author Amal Aden
 */
public class BookingStatusUI extends JFrame {
    
    // UI COMPONENTS
    
    private JLabel statusLabel;
    private JLabel depositStatusLabel;
    private JProgressBar countdownBar;
    private JLabel timeElapsedLabel;
    private JTextField badgeIdField;
    private JButton checkInButton;
    private JButton refreshButton;
    private JButton backButton;
    
    // DATA
    
    private int bookingId;
    private LocalDateTime startTime;
    private Deposit deposit;
    private PaymentService paymentService;
    private CheckInService checkInService;
    private Timer timer;
    
    // CONSTRUCTOR
    
    public BookingStatusUI(int bookingId, LocalDateTime startTime, Deposit deposit) {
         this.bookingId = bookingId;
        this.startTime = startTime;
        this.deposit = deposit;
        this.paymentService = PaymentService.getInstance();
        this.checkInService = CheckInService.getInstance();
        
        // Setup window
        setTitle("York Room Booking - Booking Status");
        setSize(500, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);
        
        // TOP PANEL: Booking Info
        
        JPanel topPanel = new JPanel(new GridLayout(4,  1, 5, 5));
        topPanel.setBorder(BorderFactory.createTitledBorder(" Booking #" + bookingId));
        topPanel.setBackground(new Color(240, 248, 255));
        topPanel.setBackground(Color.RED);
        topPanel.setForeground(Color.WHITE);
        
        statusLabel = new JLabel("Status: PENDING CHECK-IN");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 14));
        depositStatusLabel = new JLabel("Deposit:  PENDING");
        depositStatusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        topPanel.add(statusLabel);
        topPanel.add(depositStatusLabel);
        
        String time = startTime != null ? startTime.toString().replace("T", " ").substring(0, 19) : "N/A";
        topPanel.add(new JLabel("Start Time: " + time));        topPanel.add(new JLabel("Grace Period: 30 minutes"));
        
        add(topPanel, BorderLayout.NORTH);
        
        // CENTER PANEL: Countdown
        
        JPanel centerPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        centerPanel.setBorder(BorderFactory.createTitledBorder("⏱️ Check-in Timer"));
        centerPanel.setBackground(Color.WHITE);
        
        countdownBar = new JProgressBar(0, 30);
        countdownBar.setValue(0);
        countdownBar.setStringPainted(true);
        countdownBar.setFont(new Font("Arial", Font.BOLD, 12));
        
        timeElapsedLabel = new JLabel("Time elapsed: 0 / 30 minutes");
        timeElapsedLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        timeElapsedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        centerPanel.add(new JLabel(""));
        centerPanel.add(countdownBar);
        centerPanel.add(timeElapsedLabel);
        
        add(centerPanel, BorderLayout.CENTER);
        
        // BOTTOM PANEL: Check-in
        
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        bottomPanel.setBorder(BorderFactory.createTitledBorder("🎫 Check-in"));
        
        bottomPanel.add(new JLabel("Badge ID:"));
        badgeIdField = new JTextField(15);
        bottomPanel.add(badgeIdField);
        
        checkInButton = new JButton("Check In");
        checkInButton.setBackground(Color.RED);
        checkInButton.setForeground(Color.BLACK);
        checkInButton.setFont(new Font("Arial", Font.BOLD, 12));
        checkInButton.addActionListener(new CheckInListener());
        bottomPanel.add(checkInButton);
        
        refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> refreshStatus());
        bottomPanel.add(refreshButton);
        
        backButton = new JButton(" Back");
        backButton.addActionListener(e -> dispose());
        bottomPanel.add(backButton);
        
        add(bottomPanel, BorderLayout.SOUTH);
        
        // START COUNTDOWN
        
        startCountdown();
        refreshStatus();
        
        setVisible(true);
    }
        // COUNTDOWN TIMER
    
    
    private void startCountdown() {
        timer = new Timer(1000,  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (startTime == null) {
                    timer.stop();
                    return;
                }
                
                long elapsed = checkInService.getMinutesElapsed(startTime);
                
                if (elapsed <= 30) {
                    countdownBar.setValue((int) elapsed);
                    timeElapsedLabel.setText("Time elapsed: " + elapsed + " / 30 minutes");
                    
                    if (elapsed > 25) {
                        countdownBar.setForeground(Color.RED);
                    } else if (elapsed > 20) {
                        countdownBar.setForeground(Color.ORANGE);
                    } else {
                        countdownBar.setForeground(new Color(0, 150, 0));
                    }
                } else {
                    timer.stop();
                    statusLabel.setText("Status:  NO SHOW - DEPOSIT FORFEITED");
                    depositStatusLabel.setText("Deposit:  FORFEITED");
                    checkInButton.setEnabled(false);
                    
                    try {
                        paymentService.forfeitDeposit(bookingId);
                    } catch (Exception ex) {
                        System.out.println("Deposit already processed.");
                    }
                    
                    JOptionPane.showMessageDialog(BookingStatusUI.this, 
                        " 30-minute grace period expired.\nDeposit has been forfeited.", 
                        "Check-in Failed", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        timer.start();
    }
    
    // CHECK-IN LISTENER
    
    private class CheckInListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String badgeId = badgeIdField.getText().trim();
            
            if (badgeId.isEmpty()) {
                JOptionPane.showMessageDialog(BookingStatusUI.this, 
                    "Please enter your Badge ID.", 
                    "Missing Information", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            if (startTime == null) {
                JOptionPane.showMessageDialog(BookingStatusUI.this, 
                    "No start time available for this booking.", 
                     "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            boolean checkedIn = checkInService.checkIn(bookingId, badgeId, startTime);
            
            if (checkedIn) {
                timer.stop();
                statusLabel.setText("Status: CHECKED IN");
                depositStatusLabel.setText("Deposit: APPLIED TO BOOKING");
                checkInButton.setEnabled(false);
                
                try {
                    paymentService.applyDepositToBooking(bookingId);
                    System.out.println("✅ Deposit applied to booking #" + bookingId);
                } catch (Exception ex) {
                    System.out.println("Deposit already applied or not found.");
                }
                
                JOptionPane.showMessageDialog(BookingStatusUI.this, 
                    "Check-in successful!\nDeposit applied to final cost.", 
                    "Check-in Successful", 
                    JOptionPane.INFORMATION_MESSAGE);
                
                // ============================================================
                // ADD THIS: Ask user if they want to view payment history
                // ============================================================
                int response = JOptionPane.showConfirmDialog(
                    BookingStatusUI.this,
                    "Check-in successful!\nDo you want to view your payment history?",
                    "Payment History",
                    JOptionPane.YES_NO_OPTION
                );
                
                if (response == JOptionPane.YES_OPTION) {
                    dispose();  // Close BookingStatusUI
                    new PaymentHistoryUI();  // Open PaymentHistoryUI
                }
            } else {
                timer.stop();
                statusLabel.setText( "Status: NO SHOW");
                depositStatusLabel.setText( "Deposit:  FORFEITED");
                checkInButton.setEnabled( false);
                
                try {
                    paymentService.forfeitDeposit( bookingId);
                } catch ( Exception ex) {
                    System.out.println( "Deposit already forfeited or not found.");
                }
                
                JOptionPane.showMessageDialog(BookingStatusUI.this, 
                    " Check-in failed.\nDeposit has been forfeited.", 
                    "Check-in Failed", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // ============================================================
    // REFRESH STATUS
    // ============================================================
    
    private void refreshStatus() {
        if ( deposit != null) {
            depositStatusLabel.setText("Deposit: " + deposit.getState().getDisplayName());
        }
        
        if ( deposit != null && deposit.isTerminal()) {
            checkInButton.setEnabled( false);
            timer.stop();
            
            if ( deposit.isApplied()) {
                statusLabel.setText( "Status: CHECKED IN");
                depositStatusLabel.setText( "Deposit: APPLIED");
            } else if (deposit.isForfeited()) {
                statusLabel.setText( "Status: NO SHOW");
                depositStatusLabel.setText( "Deposit:  FORFEITED");
            } else if ( deposit.isRefunded()) {
                statusLabel.setText( "Status: COMPLETED");
                depositStatusLabel.setText( "Deposit: REFUNDED");
            }
        }
    }
}