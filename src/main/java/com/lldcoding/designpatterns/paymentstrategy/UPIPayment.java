package com.lldcoding.designpatterns.paymentstrategy;

public class UPIPayment implements IPaymentType{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done using UPI for amount: " + amount);
        return false;
    }
}
