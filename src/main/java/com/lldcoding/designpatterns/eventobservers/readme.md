## Observer Patter
* there is subject (who is publishing the event) and observer (who is listening to the event)
* subject will be having list of observers and will notify them when there is any change in the state of subject.
```java
public class OrderService implements Subject{

    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update("Order Checkout","customer completed checkout the order");
        }
    }
}

```