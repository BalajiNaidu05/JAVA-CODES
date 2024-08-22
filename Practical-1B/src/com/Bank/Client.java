package com.Bank;

public class Client {

    public static void main(String[] args) {
        // Get the only instance of UserSession
        UserSession session = UserSession.getInstance();

        // Login with username "Balaji"
        session.login("Balaji");

        // View balance
        session.viewBalance();

        // Deposit ₹200
        session.deposit(200);

        // Withdraw ₹150
        session.withdraw(150);

        // View balance after transactions
        session.viewBalance();

        // Logout
        session.logout();
    }
}
