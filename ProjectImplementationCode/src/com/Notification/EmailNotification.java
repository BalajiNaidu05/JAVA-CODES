package com.Notification;

public class EmailNotification extends NotificationTemplate {

	@Override
	protected void prepareMessage(String message) {
		System.out.println("Preparing email message: " +message);
	}

	@Override
	protected void send(String message) {
		System.out.println("Sending email: " +message);
	}

}
