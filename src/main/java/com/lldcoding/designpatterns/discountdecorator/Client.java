package com.lldcoding.designpatterns.discountdecorator;

public class Client {
    public static void main(String[] args) {
       // Uniform typing using the interface interface type Product
        Product phone = new Iphone();

        // Wrap with FlashSale
        phone = new FlashSaleOffer(phone);

        // Wrap with BigBillionDay (now works in any stacking order)
        phone = new BigBillionDayOffer(phone);

        System.out.println("Description: " + phone.getDescription());
        System.out.println("Final Price: " + phone.getPrice());
    }
}
