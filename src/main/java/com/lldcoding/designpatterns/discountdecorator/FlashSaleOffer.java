package com.lldcoding.designpatterns.discountdecorator;

public class FlashSaleOffer extends ProductDecorator {
    public FlashSaleOffer(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice()-10;
    }

    @Override
    public String getDescription() {
        return "Flash Sale Offer: " + product.getDescription();
    }
}
