package com.Bank;

public class User {
    private String username;
    private double balance;

    public User(String username) {
        this.username = username;
        this.balance = 1000.0; // Default balance
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
