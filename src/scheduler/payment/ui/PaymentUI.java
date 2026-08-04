package scheduler.payment.ui;  // ← CHANGED FROM york.roombooking.ui

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import scheduler.payment.service.PaymentService;  
import scheduler.payment.strategy.PaymentStrategy; 
import scheduler.payment.strategy.CreditCardStrategy;
import scheduler.payment.strategy.DebitCardStrategy;
import scheduler.payment.strategy.InstitutionalBillingStrategy;
import scheduler.payment.strategy.PaymentProcessor;
import scheduler.model.Deposit;  // ← CHANGED FROM york.roombooking.model.Deposit

public class PaymentUI extends JFrame {
    
    private JButton payButton, clearButton, backButton;
    private JRadioButton creditRadio, debitRadio, institutionalRadio;
    private ButtonGroup paymentGroup;
    private JTextField cardNumberField, expiryField, cvvField;
    private JLabel depositStatusLabel, errorLabel;
    private JTextField institutionIdField;
    private JTextField departmentField;  
    private JPanel buttonPanel;
    private LocalDateTime startTime;

    private double depositAmount;
    private int bookingId;
    private PaymentService paymentService;
    private String roomName;
    private String date;
    private String time;
    private int hours;
    private double hourlyRate;

    private class PayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            errorLabel.setText("");
            try {
                PaymentStrategy strategy = null;
                
                if (creditRadio.isSelected()) {
                    String cardNumber = cardNumberField.getText();
                    String expiry = expiryField.getText();
                    String cvv = cvvField.getText();
                    if (cardNumber.isEmpty() || expiry.isEmpty() || cvv.isEmpty()) {
                        throw new Exception("Please fill in all credit card fields.");
                    }
                    strategy = new CreditCardStrategy(cardNumber, expiry, cvv);
                    
                } else if (debitRadio.isSelected()) {
                    String cardNumber = cardNumberField.getText();
                    String expiry = expiryField.getText();
                    String cvv = cvvField.getText();
                    if (cardNumber.isEmpty() || expiry.isEmpty() || cvv.isEmpty()) {
                        throw new Exception("Please fill in all debit card fields.");
                    }
                    strategy = new DebitCardStrategy(cardNumber, expiry, cvv);
                    
                } else if (institutionalRadio.isSelected()) {
                    String instId = institutionIdField.getText();
                    String dept = departmentField.getText();
                    if (instId.isEmpty() || dept.isEmpty()) {
                        throw new Exception("Please fill in all institution billing fields.");
                    }
                    strategy = new InstitutionalBillingStrategy(instId, dept);
                }
                
                PaymentProcessor processor = new PaymentProcessor(strategy);
                processor.processPayment(depositAmount);
                paymentService.collectDeposit(bookingId, depositAmount, strategy);
                
                depositStatusLabel.setText("✅ Deposit of $" + depositAmount + " collected successfully!");
                
                int response = JOptionPane.showConfirmDialog(
                    PaymentUI.this,
                    "✅ Payment successful!\nDo you want to check in now?",
                    "Check-in",
                    JOptionPane.YES_NO_OPTION
                );
                
                if (response == JOptionPane.YES_OPTION) {
                    Deposit deposit = paymentService.findDepositByBooking(bookingId);
                    if (deposit != null) {
                        dispose();
                        new BookingStatusUI(bookingId, startTime, deposit);
                    }
                }
                
            } catch (Exception ex) {
                errorLabel.setText("❌ " + ex.getMessage());
                JOptionPane.showMessageDialog(PaymentUI.this, "❌ " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // ← CONSTRUCTOR STILL USES 8 PARAMETERS (BEFORE THE CHANGE)
    public PaymentUI(int bookingId, double depositAmount, String roomName, 
            String date, String time, int hours, double hourlyRate, LocalDateTime startTime) {
        this.bookingId = bookingId;
        this.depositAmount = depositAmount;
        this.paymentService = PaymentService.getInstance();  // ← STILL CALLED HERE
        this.roomName = roomName;
        this.date = date;
        this.time = time;
        this.hours = hours;
        this.hourlyRate = hourlyRate;
        this.startTime = startTime;
        
        // Setup window
        setTitle("York Room Booking - Checkout");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));
        setLocationRelativeTo(null);
        
        // North Panel: Booking Summary
        JPanel northPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        northPanel.setBorder(BorderFactory.createTitledBorder(" Booking Summary"));
        northPanel.setBackground(Color.RED);
        northPanel.setForeground(Color.WHITE);
        northPanel.add(new JLabel("Booking ID: " + bookingId));
        northPanel.add(new JLabel("Room: " + roomName));
        northPanel.add(new JLabel("Date: " + date + " | Time: " + time));
        northPanel.add(new JLabel("Duration: " + hours + " hours | Rate: $" + hourlyRate + "/hour"));
        northPanel.add(new JLabel("Deposit Required: $" + depositAmount + " (1 hour upfront)"));
        add(northPanel, BorderLayout.NORTH);
        
        
        setVisible(true);
    }
}
   




	

