
# Account and Authentication Module

## Overview

This module implements account registration, login, logout, account verification, account-type management, and persistent storage for the YorkU Conference Room Scheduler.

The module supports Student, Faculty, Staff, Partner, and dynamically created account types through the GUI. Passwords are securely hashed before storage, and all account information is persisted using SQLite.

---

## Design Pattern Used

### Factory Method Pattern

This module uses the **Factory Method Pattern** for user creation.

Instead of allowing the registration service to construct user objects directly, object creation is delegated to an abstract `AccountFactory`. The factory performs all common creation steps such as generating a unique user ID, hashing the password, assigning the initial account status, and recording the creation time before creating the final `RegisteredUser` object.

`RegisteredUserFactory` provides the concrete implementation of the factory method.

This approach separates object creation from business logic, making the code easier to maintain and extend.

---

## Main Features

- User registration
- User login and logout
- Student, Faculty, Staff, and Partner account types
- Dynamic account-type creation through the GUI
- Account verification
- Password strength validation
- Duplicate email validation
- Secure password hashing
- Current logged-in user display
- SQLite database persistence

---

## Database

The project uses **SQLite** for persistent storage.

The database is automatically created on first launch at:

```text
data/scheduler.db
```

The application creates the required tables automatically:

- `users`
- `account_types`

The runtime database file is excluded from Git since every developer can generate it locally.

---

## SQLite JDBC Driver

The project uses the **Xerial SQLite JDBC** driver.

The driver JAR is stored inside:

```text
lib/
```

Before running the application in Eclipse, add the JAR to the project's Build Path.

---

## Project Structure

```text
src/scheduler
├── database
├── exception
├── factory
├── model
├── repository
├── service
├── util
├── view
└── Main.java
```

### Main Classes

| Class | Purpose |
|-------|---------|
| AccountFactory | Abstract factory responsible for user creation |
| RegisteredUserFactory | Creates RegisteredUser objects |
| RegisteredUser | Represents a registered system user |
| AccountType | Stores account type information and hourly rate |
| AccountRegistrationService | Handles registration and account-type creation |
| AuthenticationService | Handles login and logout |
| VerificationService | Performs account verification |
| UserRepository | User persistence interface |
| AccountTypeRepository | Account-type persistence interface |
| SqliteUserRepository | SQLite implementation of UserRepository |
| SqliteAccountTypeRepository | SQLite implementation of AccountTypeRepository |
| DatabaseManager | Initializes the SQLite database and provides connections |

---

## Frontend

The frontend is implemented using **Java Swing**.

The interface provides:

- Register tab
- Login tab
- Add Account Type tab
- Password visibility toggle
- Logged-in user indicator
- Status messages
- YorkU-themed interface

---

## How to Run

### Eclipse

1. Open the project in Eclipse.
2. Ensure the SQLite JDBC JAR inside `lib/` has been added to the Build Path.
3. Open `src/scheduler/Main.java`.
4. Right-click `Main.java`.
5. Select **Run As → Java Application**.

The application will automatically create the SQLite database if it does not already exist.

---

## Contributor

Account and Authentication implementation by:

**Farhad Rasoli**
