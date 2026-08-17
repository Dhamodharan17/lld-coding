package com.lldcoding.designpatterns.paymentstrategy;

import java.util.UUID;

public class Client {
    public static void main(String[] args) {

        Order order = new Order(UUID.randomUUID(), 20240606, 1000, 2);
        PaymentContext paymentContext = new PaymentContext(new UPIPayment());
        paymentContext.checkout(order);

        paymentContext.setPaymentType(new CreditCard());
        paymentContext.checkout(order);
    }
}
