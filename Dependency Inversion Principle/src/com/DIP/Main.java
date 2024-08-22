package com.DIP;
public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MyApplication app = new MyApplication(emailService);
        app.send("Hello via Email!");

        app = new MyApplication(smsService);
        app.send("Hello via SMS!");
    }
}
