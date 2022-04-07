# Day5-Assignment

### _Lock_
The Lock interface has been around since Java 1.5. It's defined inside the java.util.concurrent.lock package and it provides extensive operations for locking. A lock is a more flexible and sophisticated thread synchronization mechanism than the standard synchronized block.

Lock vs Synchronized:
* synchronized is a built-in keyword in java. At the jvm level, Lock is a java class.
* with locks, you can release and acquire the locks in any order.
* with synchronized, you can release the locks only in the order it was acquired.
* With locks, the JVM will spend less time scheduling threads, better scale, and perform.
* Synchronized cannot determine whether to acquire the lock status, Lock can determine whether to acquire the lock.

### _Lock Interface:_

* lock(): It is used for acquiring the lock. For thread scheduling purposes, the current thread becomes disabled when the lock is not available.
Syntax:
```
public void lock()
```

* lockInterruptibly(): it’s used for acquiring the lock unless the current thread is interrupted. It acquires and returns a lock immediately if it is available. 
Syntax:
```
public void lockInterruptibly()  
```

* tryLock(): it’s used at the time of invocation for acquiring the lock. Boolean value ture means available. Boolean value false means not available.
Syntax:
```
public boolean tryLock()  
```
* tryLock(long time, TimeUnit unit): it’s similar to tryLock(), except it waits up the given timeout before giving up trying to acquire the Lock.

Syntax:
```
public boolean tryLock(long time, TimeUnit unit)  
```

* unlock(): it’s used for releasing the lock.
Syntax:
```
public void unlock()  
```

* newCondition(): it’s used for getting a new Condition instance that is bound to this Lock instance. The lock must be held by the current thread before waiting on the condition. A call to the condition.wait() will atomically release the lock before the wait and re-acquire the lock before the wait returns.
Syntax:
```
public Condition newCondition()  
```	

* ReentrantLock class: it implements the Lock interface. It offers the same concurrency and memory semantics, as the implicit monitor lock accessed using synchronized methods and statements, with extended capabilities.

Syntax:
```
class X {
   private final ReentrantLock lock = new ReentrantLock();
   // ...

   public void m() {
     lock.lock();  // block until condition holds
     try {
       // ... method body
     } finally {
       lock.unlock()
     }
   }
 }

```



### _ReadWriteLock interface_

It allows various threads to read a specific resource but allows only one to write it, at a time. The approach is, that multiple threads can read from a shared resource without causing concurrency errors. The concurrency errors first occur when writes and reads to a shared resource occur simultaneously, or if multiple writes take place simultaneously.

* Lock readLock() – if no thread acquired the write lock or requested for it then multiple threads can acquire the read lock.

Syntax:

```
readLock.lock();
try {
   // statements 
} 
finally {
   readLock.unlock();
}

```

*	Lock writeLock() – if no threads are reading or writing then only one thread can acquire the write lock

Syntax

```
writeLock.lock();
try {
    statements to write the data
} 
finally {
    writeLock.unlock();
}

```

* ReentrantReadWriteLock: it implements the ReadWriteLock interface.

### _Future vs CompletableFuture_

* Future is introduced in Java 5 and CompletableFuture is introduced in Java 8. CompletableFuture implements Future as well as CompletionStage.
* Future is used for asynchronous computation. It provides (a) methods to check if computation is complete, (b) method to wait to complete the computation and (c) method to get result.
* CompletableFuture is the extension of Java Future. The result of CompletableFuture can be used as as CompletionStage for next computation and so on.
* CompletableFuture has no direct control over the computation that causes it to be completed. Hence CompletableFuture cancellation is treated as exceptional completion. 
* Future runs using Executor and CompletableFuture can run either by using ForkJoinPool.commonPool() or Executor.

###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
[Baeldung](https://www.baeldung.com/java-concurrent-locks#:~:text=Simply%20put%2C%20a%20lock%20is,util.)

