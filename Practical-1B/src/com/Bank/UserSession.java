package com.Bank;

public class UserSession {
    private static UserSession singleInstance = null;
    private boolean isLoggedIn = false;
    private User user;

    private UserSession() {}

    public static UserSession getInstance() {
        if (singleInstance == null) {
            singleInstance = new UserSession();
        }
        return singleInstance;
    }

    public void login(String username) {
        if (!isLoggedIn) {
            user = new User(username);
            isLoggedIn = true;
            System.out.println(username + " logged in successfully.");
        } else {
            System.out.println("User already logged in...");
        }
    }

    public void logout() {
        if (isLoggedIn) {
            System.out.println(user.getUsername() + " logged out successfully.");
            isLoggedIn = false;
            user = null;
        } else {
            System.out.println("No user logged in currently.");
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void viewBalance() {
        if (isLoggedIn) {
            System.out.println("Balance for " + user.getUsername() + ": ₹" + user.getBalance());
        } else {
            System.out.println("Please login to view the balance.");
        }
    }

    public void deposit(double amount) {
        if (isLoggedIn) {
            user.deposit(amount);
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + user.getBalance());
        } else {
            System.out.println("Please login to deposit money.");
        }
    }

    public void withdraw(double amount) {
        if (isLoggedIn) {
            if (user.withdraw(amount)) {
                System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + user.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please login to withdraw money.");
        }
    }
}
