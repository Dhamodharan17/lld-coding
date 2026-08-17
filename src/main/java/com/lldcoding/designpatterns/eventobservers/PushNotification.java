package com.lldcoding.designpatterns.eventobservers;

public class PushNotification implements Observer{
    @Override
    public void update(String eventType, String data) {
        System.out.println("Push Notification sent for event: " + eventType + " with data: " + data);
    }
}
