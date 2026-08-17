package com.lldcoding.designpatterns.printeradapter;

import org.springframework.format.Printer;

public class Client {
    public static void main(String[] args) {
        IModernPrinter hpPrinter = new HPLaserPrinter();
       // hpPrinter.print("hello world");
        TypeWriterPrinter typeWriterPrinter = new TypeWriterPrinter();
        IModernPrinter typeWriterAdapter = new TypeWriterAdapter(typeWriterPrinter);
        typeWriterAdapter.print("hello world");

    }
}
