package com.lldcoding.designpatterns.inventorysingleton;

public class ProductLock {
    private ProductLock(){}// no one can create an instance of this class
    private final static ProductLock instance = new ProductLock();
    public synchronized ProductLock getInstance() {
        if(instance == null) {
        synchronized (ProductLock.class){
            if(instance == null) {
                return new ProductLock();
        }

      }}
      return instance;
    }
}
