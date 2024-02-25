package com.assignment;

import java.util.UUID;

public class Loan extends Account {
    private String loanId;
    private String loanType;
    private double loanAmount;

    public Loan(Account account, String loanType, double loanAmount) {
        super(account.getAccountName(), account.getAddress(), account.currentBalance());
        this.loanId = generateLoanId();
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public String getLoanId() {
        return loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void showLoanDetails() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: " + loanAmount);
        super.showDetails(); // Call the showDetails method of the Account class to display account details
    }

    private String generateLoanId() {
        // Generate a random UUID
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
