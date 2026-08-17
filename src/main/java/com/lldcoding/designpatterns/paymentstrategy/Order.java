package com.lldcoding.designpatterns.paymentstrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class Order {
    UUID orderId;
    int orderDate;
    int orderAmount;
    int numOfProducts;
}
