creating a adapter which hold the old interface to call the old logic and implements new interface to provide the new functionality.
```java
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

```