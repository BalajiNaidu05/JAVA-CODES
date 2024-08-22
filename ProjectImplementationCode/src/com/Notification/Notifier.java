package com.Notification;

public class Notifier 
{
		private NotificationTemplate notificationService;
		public Notifier (NotificationTemplate notificationService)
		{
			this.notificationService = notificationService;
		}
		public void notifyUser (String message)
		{
			notificationService.sendNotification(message);
		}
}
