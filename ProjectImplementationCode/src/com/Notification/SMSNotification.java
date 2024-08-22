package com.Notification;

public class SMSNotification extends NotificationTemplate {

	@Override
	protected void prepareMessage(String message) {
		System.out.println("Preparing SMS message: " +message);
	}

	@Override
	protected void send(String message) {
		System.out.println("Sending SMS: " +message);
	}

}
