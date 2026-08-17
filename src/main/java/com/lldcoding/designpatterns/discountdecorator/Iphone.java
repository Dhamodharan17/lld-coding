package com.lldcoding.designpatterns.discountdecorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Iphone implements Product{
    @Override
    public double getPrice() {
        return 175;
    }

    @Override
    public String getDescription() {
        return "Iphone 14 Pro Max";
    }
}
