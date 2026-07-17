package york.roombooking.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import service.PaymentService;
import strategy.PaymentStrategy;
import strategy.CreditCardStrategy;
import strategy.DebitCardStrategy;
import strategy.InstitutionalBillingStrategy;
import york.roombooking.model.Deposit;
import strategy.PaymentProcessor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import service.PaymentService;
import strategy.*;
import java.time.LocalDateTime;
/**
 * PaymentUI-checkout screen for payment and deposit 
 * user select payment method,enter details, and pay deposit.
 * @author amaladen
 *
 */
public class PaymentUI extends JFrame {
private JButton payButton, clearButton, backButton;
private JRadioButton creditRadio,debitRadio,institutionalRadio;
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

//PAY BUTTON LISTENER — INNER CLASS

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
            
            // Process payment
            PaymentProcessor processor = new PaymentProcessor(strategy);
            processor.processPayment(depositAmount);
            
            // Collect deposit
            paymentService.collectDeposit(bookingId, depositAmount, strategy);
            
            depositStatusLabel.setText("✅ Deposit of $" + depositAmount + " collected successfully!");
            
            // ============================================================
            // ASK USER IF THEY WANT TO CHECK IN
            // ============================================================
            int response = JOptionPane.showConfirmDialog(
                PaymentUI.this,
                "✅ Payment successful!\nDo you want to check in now?",
                "Check-in",
                JOptionPane.YES_NO_OPTION
            );
            
            // ============================================================
            // PLACE THE CODE HERE — INSIDE THE IF STATEMENT
            // ============================================================
            if (response == JOptionPane.YES_OPTION) {
                Deposit deposit = paymentService.findDepositByBooking(bookingId);
                if (deposit != null) {
                    dispose();  // Close PaymentUI
                    new BookingStatusUI(bookingId, startTime, deposit);  // Open BookingStatusUI
                }
            }
            
        } catch (Exception ex) {
            errorLabel.setText("❌ " + ex.getMessage());
            JOptionPane.showMessageDialog(PaymentUI.this, "❌ " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

public PaymentUI(int bookingId, double depositAmount, String roomName, 
        String date, String time, int hours, double hourlyRate, LocalDateTime startTime) {
	this.bookingId=bookingId;
	this.depositAmount=depositAmount;
	this.paymentService=PaymentService.getInstance();
	this.roomName = roomName;
    this.date = date;
    this.time = time;
    this.hours = hours;
    this.hourlyRate = hourlyRate;
    this.startTime = startTime; 
	
	//setup window
	
	setTitle("York Room Booking - Checkout");
	setSize(700,600);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLayout(new BorderLayout(15,15));
     setLocationRelativeTo(null );
     //Booking summary
     
     JPanel northPanel =new JPanel(new GridLayout(5,1,10,10));
     northPanel.setBorder(BorderFactory.createTitledBorder(" Booking Summary"));
     northPanel.setBackground(Color.RED);
     northPanel.setForeground(Color.WHITE);
     northPanel.add(new JLabel(("Booking ID: " + bookingId)));
     northPanel.add(new JLabel("Room: "+ roomName));
     northPanel.add(new JLabel("Date: " + date + " | Time: " + time));
     northPanel.add(new JLabel("Duration: " + hours + " hours | Rate: $" + hourlyRate + "/hour"));
     northPanel.add(new JLabel("Deposit Required: $" + depositAmount + " (1 hour upfront)"));
     add(northPanel, BorderLayout.NORTH);
     
     //Payment Method
     JPanel centerPanel = new JPanel(new GridBagLayout());
    centerPanel.setBorder(BorderFactory.createTitledBorder("Select Payment Method"));
     GridBagConstraints gbc = new GridBagConstraints();
     gbc.insets = new Insets(5, 5,5, 5);
     
     gbc.anchor = GridBagConstraints.WEST;
     
     //Radio buttons
     creditRadio=new JRadioButton ("Credit card",true);
     debitRadio= new JRadioButton("Debit Card");
     institutionalRadio = new JRadioButton("Institutional Billing");
     
     paymentGroup= new ButtonGroup();
     paymentGroup.add(creditRadio);
     paymentGroup.add(debitRadio);
     paymentGroup.add(institutionalRadio);
     //card area
     cardNumberField = new JTextField(20);
     expiryField = new JTextField(5);
     cvvField = new JTextField(3);
     // institution fields
     
     institutionIdField = new JTextField(15);
     institutionIdField.setEnabled(false);
     departmentField = new JTextField(15);
     departmentField.setEnabled(false);
     
     int row =0;
     
     gbc.gridy=row++;
     gbc.gridx=0;
     centerPanel.add(new JLabel("Payment Method"),gbc);
     gbc.gridx=1;
     centerPanel.add(creditRadio,gbc);
     
     gbc.gridy =  row++;
     gbc.gridx =0;
     centerPanel.add(new JLabel(""), gbc);
     gbc.gridx =1;
     centerPanel.add(debitRadio, gbc);
     
     gbc.gridy = row++;
     gbc.gridx = 0;
     centerPanel.add(new JLabel(""), gbc);
     gbc.gridx = 1;
     centerPanel.add(institutionalRadio, gbc); 
     
     gbc.gridy=row++;
     gbc.gridx=0;
     centerPanel.add(new JLabel("Card Number:"), gbc);
     gbc.gridx=1;
     centerPanel.add(cardNumberField,gbc);
     
     gbc.gridy = row++;
     gbc.gridx =0;
     centerPanel.add(new JLabel("Expiry (MM/YY):"), gbc);
     gbc.gridx =1;
     centerPanel.add(expiryField, gbc);
     
     gbc.gridy =row++;
     gbc.gridx=0;
     centerPanel.add(new JLabel("CVV:"), gbc);
     gbc.gridx=1;
     centerPanel.add(cvvField,gbc);
     
     
     gbc.gridy = row++;
     gbc.gridx = 0;
     centerPanel.add(new JLabel("Institution ID:"), gbc);
     gbc.gridx = 1;
     centerPanel.add(institutionIdField, gbc);
     
     
     gbc.gridy= row++;
     gbc.gridx=0;
     centerPanel.add(new JLabel("Department:"), gbc);
     gbc.gridx=1;
     centerPanel.add(departmentField,gbc);
     
     gbc.gridy = row++;
     gbc.gridx = 0;
     gbc.gridwidth = 2;
     errorLabel = new JLabel("");
     errorLabel.setForeground(Color.RED);
     centerPanel.add(errorLabel, gbc);
     
     add(centerPanel, BorderLayout.CENTER);
     
     JPanel southPanel= new JPanel(new BorderLayout(10,10));
     
     JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
     depositStatusLabel = new JLabel("Deposit Status: ⏳ PENDING");
     
     depositStatusLabel.setFont(new Font("Arial", Font.BOLD, 14));
     
     statusPanel.add(depositStatusLabel);
     
     buttonPanel  = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

     payButton = new JButton("Pay Deposit: $" + depositAmount);
     payButton.setForeground(Color.BLACK);  
     payButton.setBackground(Color.RED);
     payButton.setFont(new Font("Arial", Font.BOLD, 14));
     payButton.setPreferredSize(new Dimension(200, 40));
     payButton.setOpaque(true);  
     
     clearButton=new JButton("Clear");
     clearButton.setBackground(Color.BLACK);
     clearButton.setForeground(Color.BLACK);
     
     backButton = new JButton("Back");
     backButton.setBackground(Color.BLACK);
     backButton.setForeground(Color.BLACK);
     
     buttonPanel.add(payButton);
     buttonPanel.add(clearButton);
     buttonPanel.add(backButton);
     southPanel.add(buttonPanel);
     
     add(southPanel,BorderLayout.SOUTH);
     
     //event listeners
     
     creditRadio.addActionListener (e -> {
         cardNumberField.setEnabled(true);
         expiryField.setEnabled(true);
          cvvField.setEnabled(true);
         institutionIdField.setEnabled(false);
         departmentField.setEnabled(false);
     });
     
     debitRadio.addActionListener(e->{
    	 cardNumberField.setEnabled(true);
    	  expiryField.setEnabled(true);
          cvvField.setEnabled(true); 
         institutionIdField.setEnabled(false);
         departmentField.setEnabled(false);
     });
     
     institutionalRadio.addActionListener(e -> {
          cardNumberField.setEnabled(false);
          expiryField.setEnabled(false);
          cvvField.setEnabled(false);
          institutionIdField.setEnabled(true);
          departmentField.setEnabled(true);
     });
     
     payButton.addActionListener(new PayButtonListener());
     
     clearButton.addActionListener(e -> {
           cardNumberField.setText("");
          expiryField.setText("");
          cvvField.setText("");
        institutionIdField.setText("");
         departmentField.setText("");
         errorLabel.setText("");
     });
     
     // back button
     backButton.addActionListener(e -> dispose());
     
     setVisible(true);
     
     }



}
   




	

