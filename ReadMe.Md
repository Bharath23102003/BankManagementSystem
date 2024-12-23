# Bank Management System

A simple Java application to manage multiple bank accounts, allowing users to perform essential banking operations such as deposits, withdrawals, balance checks, and viewing transaction histories.

---

## Features

1. **Create New Account**: Add a new account with an initial deposit.
2. **Switch Account**: Select an existing account to perform transactions.
3. **Deposit Money**: Add funds to the selected account.
4. **Withdraw Money**: Deduct funds from the selected account (if sufficient balance is available).
5. **Check Balance**: Display the current balance of the selected account.
6. **View Transaction History**: View a detailed log of all transactions for the selected account.
7. **Exit**: Quit the application.

---

## How to Run the Project

### Requirements
- **Java Development Kit (JDK)** installed on your machine.
- A terminal or command prompt for running the program.

### Steps to Run
1. Clone this repository to your local machine or copy the code into a file named `Main.java`.
2. Open a terminal/command prompt and navigate to the project directory.
3. Compile the Java file:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

---

## Project Structure

```
Multi-Account Bank Management System/
│
├── Main.java         # The main application class (menu-driven system).
├── README.md         # Project description and instructions.
```

---

## Sample Output

```text
Bank Deposit System
1. Create New Account
2. Switch Account
3. Deposit Money
4. Withdraw Money
5. Check Balance
6. View Transaction History
7. Exit
Choose an option: 1
Enter account holder's name: Alice
Enter initial deposit amount: 500
Account created successfully for Alice.

Choose an option: 3
Enter deposit amount: 200
Successfully deposited: $200.0

Choose an option: 5
Current balance: $700.0

Choose an option: 6
Transaction History:
Account created with initial balance: $500.0
Deposited: $200.0
```

---

## Author

- **BHARATH KUMAR N**
- LinkedIn Profile - https://www.linkedin.com/in/bharath-kumar03
- Email Address - mailto: bk0276067@gmail.com
