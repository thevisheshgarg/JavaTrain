package com.assignment;

public class Main {
    public static void main(String[] args) {
        // Create an array of 10 different accounts
        Account[] accounts = new Account[10];
        accounts[0] = new Account("Alice", "123 Main St", 1000.0);
        accounts[1] = new Account("Bob", "456 Elm St", 2000.0);
        // Add more accounts...

        accounts[0].showDetails();
        // Perform transactions on the first account
        Transaction transaction = new Transaction(accounts[0]);
        transaction.depositAmount(500.0);
        transaction.withdrawAmount(200.0);

        // Create a loan for the second account
        Loan loan = new Loan(accounts[1], "home", 1000.0);

        // Perform a loan transaction on the second account
        Transaction loanTransaction = new Transaction(accounts[1]);
        loanTransaction.payLoan(300.0, "home", 1000.0);

        // Display account details after transactions
        accounts[0].showDetails();
    }
}
