package com.Notification;
import java.util.*;

public class UserEventManager 
{
    private List<UserEventListener> listeners = new ArrayList<>();
        
    public void subscribe(UserEventListener listener)
    {
        listeners.add(listener);
    }
    public void unsubscribe(UserEventListener listener)
    {
        listeners.remove(listener);
    }
    public void notify(String eventType, String message)
    {
        for (UserEventListener listener: listeners)
        {
            listener.onUserEvent(eventType, message);
        }
    }
}
