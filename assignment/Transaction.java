package com.assignment;

public class Transaction extends Loan {
    private double amount;
    private Account account;

    public Transaction(Account account) {
        super(account, "", 0); // Empty loanType and 0 loanAmount for regular transactions
        this.account = account;
        this.amount = 0; // Initialize amount to 0
    }

    public void depositAmount(double deposit) {
        if (deposit > 0) {
            account.updateBalance(deposit);
            amount += deposit;
            System.out.println("Deposited: " + deposit);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawAmount(double withdrawal) {
        if (withdrawal > 0 && withdrawal <= currentBalance()) {
            account.updateBalance(-withdrawal);
            amount -= withdrawal;
            System.out.println("Withdrawn: " + withdrawal);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void payLoan(double payment, String loanType, double loanAmount) {
        if (payment > 0 && payment <= loanAmount) {
            loanAmount -= payment;
            amount -= payment;
            System.out.println("Loan Payment: " + payment);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    public void showAccountDetails() {
        System.out.println("Account Details:");
        showLoanDetails();
        System.out.println("Transaction Amount: " + amount);
    }
    
}
