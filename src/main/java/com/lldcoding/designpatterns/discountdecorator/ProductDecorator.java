package com.lldcoding.designpatterns.discountdecorator;

abstract class ProductDecorator implements Product {
    protected final Product product;
    public ProductDecorator(Product product) {
        this.product = product;
    }
}
