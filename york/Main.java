package york;
 
import java.time.LocalDateTime;

import york.roombooking.ui.PaymentUI;

public class Main {

	    public static void main(String[] args) {
	        // Using the 7-parameter constructor with custom booking details
	        new PaymentUI(
	            101,                    // bookingId
	            30.00,                  // depositAmount
	            "Conference Hall A",    // roomName
	            "2026-11-20",           // date
	            "10:00 AM - 1:00 PM",   // time
	            3,                      // hours
	            30.00,                  //rate
	            LocalDateTime.now() //start time
	        );
	    }
	}