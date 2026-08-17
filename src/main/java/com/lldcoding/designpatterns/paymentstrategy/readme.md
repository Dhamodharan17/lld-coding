## Strategy Design Pattern
### Core Interface which hold dynamic behavior of payment strategy.
```java
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
```