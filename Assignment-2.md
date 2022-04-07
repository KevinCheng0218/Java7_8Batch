# Assignment-2
### 1.Why we need packages in java?
*	We need packages to organize the classes, interfaces, to prevent naming conflicts, to control access, enumerations and annotations easier, etc. 

### 2.What is the default imported package?
*	java.lang package, it provides the fundamental classes that are necessary to design a basic Java program.

### 3.What is Class? What is Object?
*	Class: it’s a blueprint for objects
*	Object: it’s an instance of the class. 

### 4.Why we need constructor?
*	Because you can’t create instances of the class without a constructor. A constructor is a special method of a class that initializes new objects or instances of the class.

### 5.What is the default value of local variable? What is the default value of instance variable?
*	Local variable: there are not initialized to any default values.
*	Instance variable: For numbers, the default value is 0, for Booleans it is false, and for object references it is null. 

### 6.What is garbage collection?
*	It’s process by Java perform automatic memory management and finds these unused objects and deletes them to free up memory. Something run in the background. 

### 7.The protected data can be accessed by subclasses or same package. True or false?
*	True

### 8.What is immutable class?
*	It means the content can’t be changed once an object is created. 

### 9.What’s the difference between “==” and equals method?
*	==: it’s an operator to check memory location or address of two objects are the same or not.
*	equals: it’s a method to compare the value of objects.

### 10.What is wrapper class?
*	It provides a way to use primitive data(int, Boolean, etc..) types as objects.

### 11.What is autoboxing?
*	It changes the wrapper class to the primitive type.

### 12.StringBuilder is threadsafe but slower than StringBuffer, true or false?
*	False, cause it’s not synchronized and it’s faster than StringBuffer. 

### 13.Constructor can be inherited, true or false?
*	False, it has a different name in subclasses.

### 14.How to call a super class’s constructor?
*	super();

### 15.Which class is the super class of all classes?
*	The class named object.

### 16.Create a program to count how many files/folders are there inside one folder.
*	the count method should take a parameter called Criteria like this: count(Criteria criteria){}
*	For Criteria class, multiple conditions should be included such as: folder path, includeSubFolder or not, the extension of the file be counted and so on. 
*	Optional: Take the input from keyboard.
*	Take care of the invalid inputs. Exception handling.
*	Get proper result displayed.
”There are XXX file(s) and XXX folder(s) inside folder XXX with extension XXX.” or something user friendly.

###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
