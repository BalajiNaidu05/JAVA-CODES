package com.Notification;

public abstract class NotificationTemplate 
	{
		public final void sendNotification(String message)
		{
			prepareMessage(message);
			send(message);
			logNotification();
		}
		protected abstract void prepareMessage(String message);
		protected abstract void send(String message);
		private void logNotification()
		{
			System.out.println("The notification is logged...");
		}
	}
