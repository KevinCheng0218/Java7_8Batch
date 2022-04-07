# Day3-Assigment

## Keywords 

## _For data types_

###### 4 Integer types:

* byte - hold a 8 bits, stores whole numbers from -128 to 127
* short - hold a 16 bits, stores whole numbers from -32,768 to 32,767
* int - hold a 32 bits, stores whole numbers from -2,147,483,648 to 2,147,483,647
* long - hold a 64 bits, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

###### 2 float point types:

* float - hold a 32 bits, stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
* double - hold a 64 bits, stores fractional numbers. Sufficient for storing 15 decimal digits

###### 1 character type

* char - hold a 16 bits, stores a single character/letter or ASCII values

###### 1 Boolean type

* boolean - hold a 1 bit, stores true or false values

## _Flow control_

* if: It is used to decide whether a certain statement or block of statements will be executed or not. 

Syntax:

```
if(condition)
{
   // Statements to execute if
   // condition is true
}
```

* if-else: The else statement with if statement to execute a block of code when the condition is false.

Syntax:

```
if (condition)
{
    // Executes this block if
    // condition is true
}
else
{
    // Executes this block if
    // condition is false
}
```

* if-else-if: Same as if-else, but different is, none of condition of if is ture, the final else statement will be executed. 

Syntax:

```
if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;
```


* switch-case - The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 

Syntax:

```
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}
```
* default: It is optional and can appear anywhere inside the switch block.

_3 loops_

* while loop: While loop will continue as long as the expression is true.

Syntax:

```
while (test_expression)
{
   // statements
 
  update_expression;
}
```

* do-while loop: For a while statement, if the condition is not met, the loop cannot be entered. But sometimes we need to execute at least once even if the condition is not met. A do-while loop is similar to a while loop, except that the do-while loop executes at least once.

Syntax:

```
do
{
    // loop body
    
    update_expression
}
while (test_expression);
```

* for-loop: While all looping constructs can be represented as while or do-while, Java provides another statement - the for loop, which makes some looping constructs simpler. The number of times the for loop is executed is determined before execution.

Syntax: 

```
for (initialization expr; test expr; update exp)
{
     // body of the loop
     // statements we want to execute
}
```

_3 jump statements_

* break: It's used for terminate a sequence in a switch statement and exit a loop.

* continue: It works in any looping control structure. The effect is to make the program jump to the next iteration of the loop immediately.

* return: The return statement is used to explicitly return from a method. That is, it causes program control to transfer back to the caller of the method.

## _Modifiers_

* public: The class is accessible by any other class.
* private: The code is only accessible within the declared class.
* protected: It can modify data members, constructors, method members, from the same class, subclasses of the same packages, different classes of the same packages, and subclasses of different packages.
* static: Used to decorate class methods and class variables.
* final: Attributes and methods cannot be overridden/modified
* abstract: Used to create abstract classes and abstract methods.
* synchronized: Methods can only be accessed by one thread at a time
* native: It is applied to a method to indicate that the method is implemented in native code using JNI (Java Native Interface). 
* strictfp: strictfp was introduced in Java version 1.2. It is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable. 
* transient: When a serialized object contains instance variables decorated with transient, the Java Virtual Machine (JVM) skips that particular variable.
* volatile: The value of an attribute is not cached thread-locally, and is always read from the main memory.

## _Exception handling_

* try-catch: It is used to handle exceptions and prevents the abnormal termination of the program.

Syntax:

```
try{
  // Block of code to try
}
catch(exception e) {
  // Block of code to handle errors
}
```

* finally: It defines a block of code we use along with the try keyword. It defines code that's always run after the try and any catch block, before the method is completed.
* throw: It is used to explicitly throw an exception from a method or any block of code.

Syntax:

```
throw throwableObject;
```

* throws: It is used in the signature of method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block. 

Syntax:

```
type method (arguments) throws Exception1, Exception2, … {  }
```

* assert: It allows for testing the correctness of any assumptions that have been made in the program. It is mainly used for testing purposes during development. 


## _Class related_

* class: It's a blueprint for creating objects.
* package: It's used to group related classes.
* import: It's used to import a package, class or interface.
* extends: it's inherited from another class.
* implements: it's used to implement an interface. 
* interface: It's a blueprint of a class.

## _Object related keywords_

* new: It's used to create an instance of the class.
* instanceof: It's used to test if an object is of a given type.
* super: It's a reference variable that is used to refer parent class objects.
* this: It's a reference variable that refers to the current object.

###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
