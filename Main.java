package Bank_Management_System;

import java.util.*;

class BankAccount {
    private String accountHolderName;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: $" + initialBalance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            transactionHistory.add("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            transactionHistory.add("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void showTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount currentAccount = null;

        int choice;
        do {
            System.out.println("\nBank Deposit System");
            System.out.println("1. Create New Account");
            System.out.println("2. Switch Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double deposit = scanner.nextDouble();
                    BankAccount newAccount = new BankAccount(name, deposit);
                    accounts.add(newAccount);
                    System.out.println("Account created successfully for " + name + ".");
                    break;

                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available. Create an account first.");
                    } else {
                        System.out.println("Select an account:");
                        for (int i = 0; i < accounts.size(); i++) {
                            System.out.println((i + 1) + ". " + accounts.get(i).getAccountHolderName());
                        }
                        int accountChoice = scanner.nextInt();
                        if (accountChoice > 0 && accountChoice <= accounts.size()) {
                            currentAccount = accounts.get(accountChoice - 1);
                            System.out.println("Switched to account: " + currentAccount.getAccountHolderName());
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                    break;

                case 3:
                    if (currentAccount == null) {
                        System.out.println("No account selected. Switch to an account first.");
                    } else {
                        System.out.print("Enter deposit amount: ");
                        double amount = scanner.nextDouble();
                        currentAccount.deposit(amount);
                    }
                    break;

                case 4:
                    if (currentAccount == null) {
                        System.out.println("No account selected. Switch to an account first.");
                    } else {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = scanner.nextDouble();
                        currentAccount.withdraw(amount);
                    }
                    break;

                case 5:
                    if (currentAccount == null) {
                        System.out.println("No account selected. Switch to an account first.");
                    } else {
                        currentAccount.checkBalance();
                    }
                    break;

                case 6:
                    if (currentAccount == null) {
                        System.out.println("No account selected. Switch to an account first.");
                    } else {
                        currentAccount.showTransactionHistory();
                    }
                    break;

                case 7:
                    System.out.println("Thank you for using the Bank Deposit System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
