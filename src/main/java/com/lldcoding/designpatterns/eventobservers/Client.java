package com.lldcoding.designpatterns.eventobservers;

public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.registerObserver(new Email());
        orderService.registerObserver(new Whatsapp());
        orderService.registerObserver(new PushNotification());

        orderService.notifyObservers();
    }



}
