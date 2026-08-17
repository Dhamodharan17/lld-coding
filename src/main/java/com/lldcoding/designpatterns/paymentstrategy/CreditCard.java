package com.lldcoding.designpatterns.paymentstrategy;

public class CreditCard implements IPaymentType {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using CreditCard for amount: " + amount);
        return false;
    }
}