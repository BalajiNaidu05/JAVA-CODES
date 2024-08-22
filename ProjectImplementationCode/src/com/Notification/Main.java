package com.Notification;


public class Main {

    public static void main(String[] args) {
        UserEventManager eventManager = new UserEventManager();

        Notifier emailNotifier = new Notifier(new EmailNotification());
        Notifier smsNotifier = new Notifier(new SMSNotification());
        Notifier pushNotifier = new Notifier(new PushNotification());

        UserEventListener emailListener = (eventType, message) -> {
            if ("USER_REGISTERED".equals(eventType)) {
                emailNotifier.notifyUser(message);
            }
        };

        UserEventListener smsListener = (eventType, message) -> {
            if ("PASSWORD_RESET".equals(eventType)) {
                smsNotifier.notifyUser(message);
            }
        };

        UserEventListener pushListener = (eventType, message) -> {
            if ("USER_REGISTERED".equals(eventType) || "PASSWORD_RESET".equals(eventType)) {
                pushNotifier.notifyUser(message);
            }
        };

        eventManager.subscribe(emailListener);
        eventManager.subscribe(smsListener);
        eventManager.subscribe(pushListener);

        eventManager.notify("USER_REGISTERED", "New user registered: Veera@gmail.com");
        eventManager.notify("PASSWORD_RESET", "User requested password reset: Balaji@gmail.com");
    }
}
