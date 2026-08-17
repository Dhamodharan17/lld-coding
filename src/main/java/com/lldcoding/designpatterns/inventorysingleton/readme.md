# block entire method performance issue
```java
 public synchronized ProductLock getInstance() {
        if(instance == null) {
            instance =  ProductLock();
      }
      return instance;
    }
```
# only blocking the instance creation part
```java
  public  ProductLock getInstance() {
        //other logic can be here which is not blocking the instance creation
    /*
            Every thread that reaches this method must acquire the lock before checking if (instance == null). 
            This has the exact same performance bottleneck as Snippet 1—threads cannot bypass the synchronized block once the object is initialized.
     */
        synchronized (ProductLock.class){
            if(instance == null) {//to check even not null, thread has to wait (performance issue)
                instance = ProductLock();
        }
        
      }
      return instance;
    }
```

# other threads waiting outside can entire quickly access the instance without waiting for the lock to be released.
```java
public synchronized ProductLock getInstance() {
    // First check (no synchronization overhead)
        if(instance == null) {
        synchronized (ProductLock.class){
            // Second check (with synchronization)
            if(instance == null) {
                instance =  ProductLock();
        }

      }}
      return instance;
    }
```