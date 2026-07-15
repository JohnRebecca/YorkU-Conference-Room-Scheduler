1. york.roombooking.ui — User Interface
Purpose: Contains all Swing GUI screens for the payment module.

"My section is organized into five packages: ui for the graphical user interface screens, model for the data models, exceptions for custom error handling, service for the business logic, and strategy for the Strategy Pattern implementation of payment methods. The ui package depends on the service package, which in turn uses the model and strategy packages."

Class	What It Does
PaymentUI	Checkout screen — user selects payment method, enters card details, pays deposit
BookingStatusUI	Check-in screen — shows 30-minute countdown, badge scan, deposit status
PaymentHistoryUI	Payment history screen — table showing all deposits with statuses

2. york.roombooking.model — Data Models
Purpose: Contains the data model classes that represent real-world objects.

Class	What It Does
Deposit	Represents a deposit made for a booking (ID, amount, status, payment method)
DepositState	Enum — defines deposit states (PENDING, APPLIED, FORFEITED, REFUNDED)

3. york.roombooking.exceptions — Custom Exceptions
Purpose: Contains custom exception classes for error handling.

Class	What It Does
InvalidCardException	Thrown when card number is not 12-16 digits
PaymentDeclinedException	Thrown when payment is declined 
DepositNotFoundException	Thrown when a deposit is not found for a booking
InvalidStateException	Thrown when trying to change a deposit to an invalid state

4. service — Business Logic
Purpose: Contains the main service classes that handle business logic.

Class	What It Does
PaymentService	Handles deposit operations (collect, apply, forfeit, refund)
CheckInService	Handles 30-minute grace period check-in logic

5. strategy — Design Pattern (Strategy Pattern)
6. 
Purpose: Contains the Strategy Pattern implementation for payment methods.

Class	What It Does
PaymentStrategy:	Interface for all payment strategies
CreditCardStrategy:	Credit card payment implementation
DebitCardStrategy:	Debit card payment implementation
InstitutionalBillingStrategy:	Institutional billing implementation
PaymentProcessor:	Context class that uses the payment strategy
Package Dependency Flow
text

Package Summary Table
Package	Purpose	Key Classes
york.roombooking.ui	Swing GUI screens	PaymentUI, BookingStatusUI, PaymentHistoryUI
york.roombooking.model	Data models	Deposit, DepositState
york.roombooking.exceptions	Custom exceptions	InvalidCardException, PaymentDeclinedException, DepositNotFoundException, InvalidStateException

service:	PaymentService, CheckInService
strategy:	Strategy Pattern	PaymentStrategy, CreditCardStrategy, DebitCardStrategy, InstitutionalBillingStrategy, PaymentProcessor



