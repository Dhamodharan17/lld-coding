package com.lldcoding.designpatterns.eventobservers;

public class Email implements Observer{
    @Override
    public void update(String eventType, String data) {
        System.out.println("Email sent for event: " + eventType + " with data: " + data);
    }
}
