package com.lldcoding.designpatterns.eventobservers;

public class Whatsapp implements Observer{
    @Override
    public void update(String eventType, String data) {
        System.out.println("Whatsapp sent for event: " + eventType + " with data: " + data);
    }
}
