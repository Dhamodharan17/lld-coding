package com.lldcoding.designpatterns.printeradapter;

public class AsusWifiPrinter implements IModernPrinter{
    @Override
    public void print(String text) {
        System.out.println("Printing using Asus Wifi Printer: " + text);
    }
}
