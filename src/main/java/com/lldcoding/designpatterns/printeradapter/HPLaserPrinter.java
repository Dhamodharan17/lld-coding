package com.lldcoding.designpatterns.printeradapter;

public class HPLaserPrinter implements IModernPrinter{
    @Override
    public void print(String text) {
        System.out.println("Printing using HP Laser Printer: " + text);
    }
}
