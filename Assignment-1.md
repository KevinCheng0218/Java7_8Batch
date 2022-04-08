# Assignment-1
### 1.What is JDK? JRE? JVM?
*	JDK: Java Development Kit, tools for developing Java applets and applications such as JVM compiler, debugger, etc.
*	JRE: Java Runtime Environment, it’s part of a JDK and it’s a set of components to create and run a Java applications.
*	JVM: Java Virtual Machine, it enables a computer to run the Java programs on any OS.

### 2.What is java compiler?
*	It converts a Java source program into bytecode (intermediate language) or to a just-in-time (JIT) compiler that converts bytecode into machine language.

### 3.Why is java platform independent?
*	Because it uses a virtual machine. The virtual machine takes care of the differences between the bytecodes for the different platforms.

### 4.What is IDE? Why is it important for developers?
*	IDE: Integrate Development Environment. A software suite that consolidates basic tools required to write and test software.

### 5.Is java case sensitive?
*	Yes, it lets you infer what a name means based on its case.

### 6.What do the following key words do?
*	Static: Used to decorate class methods and class variables.
*	Final: Attributes and methods cannot be overridden/modified.
*	Public: The class is accessible by any other class.
*	Private: The code is only accessible within the declared class.
*	Void: it means a method does not have a return type.
*	Null: it means nothing, no object, At all.
*	Package: it’s used to group releated classes.
*	Class: it’s a blueprint for creating objects.
*	New: It’s used to create an instance of the class.

### 7.What is primitive type and reference type?
*	Primitive type: The types are predefined and specified the size and type of any standard values. 
*	Reference type: It holds references to objects and provide a means to access those objects stored somewhere in memory.

### 8.Is parameter passed by value or reference?
*	Java is always passed by value. For primitive types, parameters are pass-by-value and for object types, the object reference is also pass-by-value.

### 9.What is the output: System.out.println(1 > 0 : “A”:”B”);
*	A

### 10.How to define constants in java?
*	(publice/private) (static) final Type Name = Value;
 
### 11.What is String? Is it primitive type?
*	No, it is basically an object that represents sequence of char values.

### 12.How to check if a String is representing a number?
*	Using Java’s built-in methods:
    - Integer. parseInt(String)
    -	Float. parseFloat(String)
    -	Double. parseDouble(String)
    -	Long. parseLong(String)
    -	new BigInteger(String)

### 13.Write a program to implement the following activity diagram:
### 14.Write a program to merge two array of int.
```
public class mergeTwoArrayOfInt {
    public static void main(String[] args) {
        int []a=new int[(int)(Math.random()*3+3)];
        int []b=new int[(int)(Math.random()*3+3)];

        System.out.println("a Array:");
        for (int i=0;i<a.length;i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println(a[i]);
        }
            System.out.println("b Array:");
            for (int j=0;j<b.length;j++){
                b[j]=(int)(Math.random()*100);
                System.out.println(b[j]);
            }
        System.out.println("a merged b: ");
        int []c=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        for ( int each : c){
            System.out.print(each+" ");
        }
    }
}
```

### 15.Write a program to find the second largest number inside an array of int.
```
import java.util.Arrays;

public class secondLargestNumber {
    public static void main(String[] args) {

        int firMax = 0;
        int secMax = 0;
        int[] a = new int[] {87,10,54,14,77,23};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i=0,len=a.length; i<len; i++) {
            if (a[i] > firMax) {
                secMax = firMax;
                firMax = a[i];

                continue;
            }

            if (a[i] > secMax && a[i] != firMax) {
                secMax = a[i];
            }
        }
        System.out.println("Second large number: " + secMax);
    }
}
```


###### _Reference_
[GeeksforGeeks](https://www.geeksforgeeks.org/java/?ref=shm)
[W3School](https://www.w3schools.com/java/default.asp)
