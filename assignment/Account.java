package com.assignment;

import java.util.UUID;

public class Account {
    private String accountId;
    private String accountName;
    private String address;
    private double currentBalance;

    public Account(String accountName, String address, double initialDeposit) {
    	this.accountId = generateAccountId();
    	this.accountName = accountName;
    	this.address = address;
        this.currentBalance = initialDeposit;
    }
 

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public double currentBalance() {
        return currentBalance;
    }

    public void showDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Name: " + accountName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + currentBalance);
    }

    public String getDetails() {
        return "Account ID: " + accountId + "\nAccount Name: " + accountName + "\nAddress: " + address + "\nDeposit Amount: " + currentBalance;
    }
    
    public void updateBalance(double amount) {
    	currentBalance= currentBalance + amount;
    }
    
    private String generateAccountId() {
        // Generate a random UUID
        return UUID.randomUUID().toString().substring(0, 8);
    }
}