# JVM
Java Virtual Machine, it enables a computer to run the Java programs on any OS. To define VM is JVM, as long as the VM runtime memory model implement those 5 area that you can called JVM.
* Class Loader
* Runtime Memory / Data Area
   - Holds the runtime variables and data
     - Method Area
       - static keyword, static code. This is public for each and every of the threads same as heap.
	   - Heap
       - executing new employee();
     - Stack
	     - hold main thread, it will point to the heap. The “e” will be in here. It’s private and isolated.
     - PC register
       - Need to know which code line is executing right now. it’s private.
     - Native Method area
       - it’s public.     
*	Execution Engine
    - Interpreter
    - JIT Compiler
    - Garbage Collector

### Class Loader
To put the class to JVM, the class has to go through the Class loader.
*	Loading 
	- Bootstrap
	- Extension
	- Application
* Linking 
  - Verify
  - Prepare
  - Resolve
* Initialization. 
  - initialize

# JDK
Java Development Kit, It’s the tool for developing Java applets and application such as JVM compiler, debugger, etc.
# JRE
Java Runtime Environment, It’s part of a JDK and it’s a set of components to create and run a Java applications.

# Comparable vs Comparator

1. Comparable (Interface) is capable of comparing itself with another object. The class itself must implements the java.lang.Comparable interface to compare its instances. 

Syntax:
```
compareTo()
```


2. Comparator (Interface) is external to the element type we are comparing. It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members.

Syntax:
```
compare()
```

To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.


# GC - Garbage Collection
It’s process by Java perform automatic memory management and finds these unused objects and deletes them to free up memory. Something run in the background.

1. Serial GC
  - it basically works with a single thread. As a result, this GC implementation freezes all application threads when it runs.
2. Parallel GC
  - It's the default GC of the JVM and sometimes called Throughput Collectors. Unlike Serial Garbage Collector, this uses multiple threads for managing heap space.
3. CMS GC
  - The Concurrent Mark Sweep (CMS) implementation uses multiple garbage collector threads for garbage collection.
4. G1 GC
  - It's designed for applications running on multi-processor machines with large memory space. It's available since JDK7 Update 4 and in later releases. G1 collector will replace the CMS collector since it's more performance efficient.
5. Z GC
  - It's a scalable low-latency garbage collector which debuted in Java 11 as an experimental option for Linux. ZGC performs all expensive work concurrently, without stopping the execution of application threads for more than 10 ms.which makes it suitable for applications that require low latency.

