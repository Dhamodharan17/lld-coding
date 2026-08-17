Decorator Design Pattern

### Core Interface which wraps the actual object inside decorator.
```java
abstract class ProductDecorator implements Product {
    protected final Product product;
    public ProductDecorator(Product product) {
        this.product = product;
    }
}
```
### Decorator will now perform the additional functionality of applying discount on the given product price.
```java
public class FlashSaleOffer extends ProductDecorator {
    public FlashSaleOffer(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice()-10;
    }

    @Override
    public String getDescription() {
        return "Flash Sale Offer: " + product.getDescription();
    }
}
```