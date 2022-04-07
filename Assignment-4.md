# Assignment-4
### 1.What’s the difference between final, finally? What is finalize()?
*	final: it’s a modifier that is used with class method and variable.
*	finally: it’s used to create a block of code along with the try keyword.
*	finalize: it’s cleanup on objects that GC found to be unreachable.

### 2.What’s the difference between throw and throws?
*	throw: It’s used to throw an exception from a method or any block of code.
*	throws: It’s used in the signature of the method to indicate that this method might throw one of the listed type exceptions.

### 3.What are the two types of exceptions?
*	Checked exception: it directly inherits the throwable class except for RuntimeException and Error such as ClassNotFound, IOException, SQLException.
*	Unchecked exception: it inherits the RuntimeException such as  ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException.

### 4.What is error in java?
*	It’ irrecoverable such as OutOfMemoryError, VirtualMachineError, AssertionError, etc.

### 5.Exception is object, true or false?
*	True.

### 6.Can a finally block exist with a try block but without a catch?
*	Yes, it will always execute even there is an exception occurred in a try block except System.exit(). 

### 7.From java 1.7, give an example of the try-resource feature.
```
  // Using try-with-resources  
try(FileOutputStream fileOutputStream =newFileOutputStream("/java7-new-features/src/abc.txt")){      
  String msg = "Welcome to javaTpoint!";      
  byte byteArray[] = msg.getBytes(); //converting string into byte array      
  fileOutputStream.write(byteArray);  
  System.out.println("Message written to file successfuly!");      
} catch(Exception exception){  
       System.out.println(exception);  
}      
```
### 8.What will happen to the Exception object after exception handling?
*	The Exception will be garbage collected in the next garbage collection.

### 9.Can we use String as a condition in switch(str){} clause?
*	Yes, switch is able to byte, short, int, char. String, and enum. 

### 10.What’s the difference between ArrayList, LinkedList and vector?
*	ArrayList: it’s implemented as a resizable array. As more elements are added to ArrayList, its size is increased dynamically. It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array.
*	LinkedList: it’s implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods.
*	Vector: it’s similar with ArrayList, but it is synchronized. 

### 11.What’s the difference between hashTable and hashMap?
|HashMap|HashTable|
|---|---|
|Methods are not synchronized|Key methods are synchronized|
|Not thread safety|Thread safety|
|Iterator is used to iterate the values|Enumerator is used to iterate the values|
|Allows one null key and multiple null values|Doesn’t allow anything that is null|
|Performance is high than HashTable|Performance is slow|

### 12.What is static import?
* It allows the static items of one class to be referenced in another without qualification.

### 13.What is static block?
*	It’s a set of instructions that is run only once when a class is loaded into memory.

### 14.Explain the keywords:
*	default(java 1.8): It is optional and can appear anywhere inside the switch block.
*	break: To exit a loop from the switch statement.
*	continue: To make the program jump to the next iteration of the loop immediately.
*	synchronized: Methods can only be accessed by one thread at a time.
*	strictfp: It is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
*	transient: When a serialized object contains instance variables decorated with transient, the Java Virtual Machine (JVM) skips that particular variable.
*	volatile: The value of an attribute is not cached thread-locally, and is always read from the main memory.
*	instanceOf: It's used to test if an object is of a given type.

### 15.Create a program including two threads – thread read and thread write.
Input file ->Thread read -> Calculate -> buffered area
Buffered area -> Thread write -> output file
Detailed description is in assignment4.txt file.
Sample input.txt file.
Attached files are input.txt and a more detailed description file.

###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
