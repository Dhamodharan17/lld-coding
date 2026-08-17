package com.lldcoding.designpatterns.paymentstrategy;

public interface IPaymentType {
    boolean pay(double amount);
}
