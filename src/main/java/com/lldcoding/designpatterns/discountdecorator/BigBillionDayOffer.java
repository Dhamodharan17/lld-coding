package com.lldcoding.designpatterns.discountdecorator;

public class BigBillionDayOffer extends ProductDecorator{
    public BigBillionDayOffer(Product product) {
      super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice()-20;
    }

    @Override
    public String getDescription() {
        return "Big Billion Day Offer: " + product.getDescription();
    }
}
