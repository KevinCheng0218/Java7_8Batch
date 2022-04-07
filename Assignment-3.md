# Assignment-3
### 1.Explain polymorphism.
*	it’s the ability of an object to take many forms. It occurs when we have many classes that are related to each other by inheritance. 

### 2.What is overloading?
*	It’s the ability to define more than one method with the same name in a class.

### 3.What is overriding?
*	It allows a subclass or child class has the same method that declared in the parent class.

### 4.What does the final mean in this method:  public void doSomething(final Car aCar){}
*	aCar can’t be reassigned. 

### 5.Suppose in question 4, the Car class has a method setColor(Color color){…}, inside doSomething method, Can we call aCar.setColor(red);?
*	Yes

### 6.Can we declare a static variable inside a method?
*	No, static variables must be declared like a class member in the class.

### 7.What is the difference between interface and abstract class?
*	Interface: 
    - It doesn’t have any constructor and couldn’t be instantiated.
    - The abstract method alone should be declared.
    - Classes that implement the interface should provide the implementation for all the methods.
    - The interface contains only constants.
*	Abstract class:
    - Abstract classes have a default constructor and it is called whenever the concrete subclass is instantiated.
    - It contains Abstract methods as well as Non-Abstract methods.
    - The class which extends the Abstract class shouldn’t require the implementation of all the methods, only Abstract methods need to be implemented in the concrete sub-class.
    - Abstract class contains instance variables.
   
### 8.Can an abstract class be defined without any abstract methods?
*	Yes, it has both abstract methods and non-abstract methods. The abstract class can extend only one class or one abstract class at a time.

### 9.Since there is no way to create an object of abstract class, what’s the point of constructors of abstract class?
*	To initialize the non-abstract methods and instance variables. 

### 10.What is a native method?
*	It can access system-specific functions and APIs that are not available directly in java and allows to implement other languages such C, C++. 
 
### 11.What is marker interface?
*	It is an interface that has no method declarations or fields in it. It is used as a tag to let the compiler know it needs to add some special behavior to the class implementing the marker interface.

### 12.Why to override equals and hashCode methods?
*	If two objects are equal according to the equals(Object) method, then calling the hashcode() method on each of the two objects must produce the same integer result.

### 13.What’s the difference beween int and Integer?
*	int: it’s a primitive data type, it helps in storing integer value into memory.
*	Integer: it’s a wrapper class, it helps in converting int into object and to convert an object into int as per requirement.

### 14.What is serialization?
*	It’s the conversion of the state of an object into a byte stream.

### 15.Create List and Map. List A contains 1,2,3,4,10(integer) . Map B contains ("a","1") ("b","2") ("c","10")   (key = string, value = string) 
Question: get a list which contains all the elements in list A, but not in map B.

### 16.Implement a group of classes that have common behavior/state as Shape. Create Circle, Rectangle and Square for now as later on we may need more shapes. They should have the ability to calculate the area. They should be able to compare using area. Please write a program to demonstrate the classes and comparison.  You can use either abstract or interface. Comparator or Comparable interface.

###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
