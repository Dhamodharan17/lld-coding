package com.lldcoding.designpatterns.paymentstrategy;

public class PaymentContext {
    IPaymentType paymentType;
    public PaymentContext(IPaymentType paymentType) {
        this.paymentType = paymentType;
    }
    void checkout(Order order) {
        paymentType.pay(order.getOrderAmount());
    }

    public void setPaymentType(IPaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
