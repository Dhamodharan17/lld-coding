package com.lldcoding.designpatterns.discountdecorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Samsung implements Product{
    @Override
    public double getPrice() {
        return 45;
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S23 Ultra";
    }
}
