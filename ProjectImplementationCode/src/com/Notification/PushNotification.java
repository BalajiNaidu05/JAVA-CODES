package com.Notification;

public class PushNotification extends NotificationTemplate {

	@Override
	protected void prepareMessage(String message) {
		System.out.println("Preparing push notification message: " +message);
	}

	@Override
	protected void send(String message) {
		System.out.println("Sending push notification: " +message);
	}

}
