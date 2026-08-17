package com.lldcoding.designpatterns.printeradapter;

public class TypeWriterAdapter implements IModernPrinter{
    TypeWriterPrinter typeWriterPrinter;
    public TypeWriterAdapter(TypeWriterPrinter typeWriterPrinter) {
        this.typeWriterPrinter = typeWriterPrinter;
    }
    @Override
    public void print(String text) {
        typeWriterPrinter.typeWrite("old printer");
    }
}
