Core Java - 

Features of Java:

- Object Oriented
- Platform independent / OS independent 
- More Secure
- Robust
- Multi-threaded

- Java versions are backword compatible. 
- Current Java version is 22
- Features on version "x" will always work on "x+1" and not vice versa.

Java is platform independent:

  Source Code (Hello.java) => COMPILER (javac command) => Byte Code (intermediate code Hello.class) => JVM (Interpreter) => M/c code => Executed by OS

OS always understands m/c code (which is specific to OS)

In above example, if program is compiled on Windows OS using Java 11, then it's bytecode (.class) file can run on any OS with Java version 11 or greater.
This is called as Platform independent.

JVM is platform dependent. As per OS it generates m/c code.

Is Java  Compiled or Interpreted Language?
- Java is both compiled and interpreted language. (Javac - compiler, JVM - interpreter)

What is JIT?
JIT is "Just in time Compiler" which works along with JVM to optimise m/c code generation.
It uses caching and optimisation techniques to speed of conversion from byte code to m/c code.

All JVMs are JIT enabled.

If i write same source code on both Windows and Linux, would Bytecode same or different?
SAME.

Bytecode is Platform independent.

JDK : Java Development Kit
JRE : Java Runtime Environment
JVM : Java Virtual Machine

What is Identifier?
Variable name, method name and class name are considered as identifiers.

Rules/guidance about naming identifier:
- Class Name should starts with "captial" letter. e.g. Employee, Student, VisualStudio etc.
- Method names and varaiable names should follow "camel notation"
  e.g.
        float empSalary;
        String color;
        void calculateEmpSalary() {}

Identifier can contain numbers, alphabates (a-z, A-Z) and special char "underscore" (_)
It can start with underscore/alphabate, but it can NOT start with numbers.
e.g.
      Valid identifers:
        abc, a_bc, _abc, ab12, __abc_pqr
      Invalid identifiers:
        123a, a*b,

Types of functions in Java:
1) instance function  : called using "object" (or instance)
2) static function    : called using Class name.

Types of packages in Java:
JDK comes with multiple in-built packages.
e.g.
java.lang : All commonly used classes (e.g. System, String, Integer, Thread etc)
java.io : IO related classes
java.net : Networking related classes
java.util: Uitility classes, Collection
java.sql : SQL related classes (JDBC)
java.awt : AWT UI classes
javax.swing: Swing UI classes

Method signature/method declaration:

public static int add(int a, int b) =====> Method Signature/Declaration

{         ---------------- Method definition start  ----------------
  int ans = a + b;
  return ans;
}         ---------------- Method definition ends   ----------------


public static void main()

File Naming Rules:

- If file consist of non-public classes then file name can be anything.
e.g

    class A {} 
    File name can be B.java

    Compilation : javac B.java
    Run         : java A

- If file consist of "public" class then file name MUST match to public class.

  public class A {}
  File name MUST be A.java

- Can we have more than one public classes in one file ? NO. (Compilation error)

Puzzle:
public class A {}
class B { public static void main(String[] args) {} }
class C { }

What should be file name? It must be "A.java"
How many .class files will be generated? => 3 classes i) A.class ii) B.class iii) C.class
Which class is used with "#java" command?
  Any class having main() funciton.
  Ans: #java B

In Real application we have multiple classes, however entry point function main() will be there ONLY in one class from where execution starts.

Ideally we should be having one class in one file.

OOP concepts:
Following are Object oriented concepts in Java.
1) Encapsulation
2) Polymorphims
3) Inheritance
4) Abstraction

Encapsulation:
- Biding related things together is called as an encapsulation.
"Class" is an example of encapsulation.

What is "Class" concept?

- Class is a template/blueprint of an object.
- Any entity having properties(state) and functions (behaviours) can be considered as a class.
- It's like a empty photo frame.
- Example of classes:
  Student, Employee, MobileApp, Electornics, Country etc.
- "object" given actual existance to a class. Without object there is no meaning to a class.

class Employee {
  // properties of Employee class
  int empId;
  float salary;
  String name;
  // functions of Employee

  getEmpDetails() { }
  getInHandSalary() {}
  getTaxDetails() {}
  ...
}

What is an Object?
- Object is an "instnace" of a class.
- Object gives real meaning to a class.
- If we have to store information of 5 employees, we will end up creating 5 objects of Employee class.
- In Java, we create an object using "new" keyword.
  e.g.  Employee e1 = new Employee();
        Student  s1 = new Student();

Primitive Types/Data Types in Java:

There are 8 primitive types:

byte    1 byte
short   2 bytes
int     4 bytes
long    8 bytes

float   4 bytes
double  8 bytes

char    2 bytes (UTF/Multi-byte format)
boolean 1 bit (true-1, false-0)

Wrapper class:
Java provides class for each and every primitive type which is called as "Wrapper" class.
e.g. Integer is a wrapper class for int type.
This is required to represent data types as an object (OOP)

Typecasting:
Convering one type into another type is called as type-casting.
There are 2 types:
a) Implicit type casting (Converting small type into big type) e.g.   short -> int
b) Explicit type casting (Converting big type into small) e.g. int -> short

Integer Wrapper Class Functions:

How to create Integer object?
 Integer obj = Integer.valueOf(50); // Old way Integer obj = new Integer(50)

What is AutoBoxing? 
      int ans = i + obj; // AUTO Boxing (obj value will be consider)

How to find Integer Max/Min value?
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);

How to convert String to integer?
      String s = "100";
      int num = Integer.parseInt(s); // "100" => 100 (String to number conversion)

How to convert Decimal to binary, hex, octal?
      System.out.println(Integer.toBinaryString(12));//1100
      System.out.println(Integer.toHexString(81));
      System.out.println(Integer.toOctalString(71));

What all things a class can consist of?
- Instance properties
- Static properties
- Instance functions
- Static functions
- Constructor (default, parmeterised)
- Instance block
- Static Block
- Inner class

Instance properties:
- Properties of an object.
- Also called as "non-static" properties
- Accessed using object/instance
- Every object gets dedicated memory for instance properties.

Static properties
- Properties of a class
- Declared using "static" keyword
- Accessed directly using class name

Instance function:
- Also called as "non-static" functions.
- Functions which accesses/modifies instance properties are called as "instance" functions.
- We need an object of a call to invoke/call instance functions.

Static function:
- Declared using "static" keyword
- Functions which accesses/modifies static properties are called as "static" functions.
- We can call static functions directly using a class name

Constructor :
- Special function whose name is same as class name.
- It does NOT have return type
- It gets called automatically when object of class is created.
- For one class we can have multiple constructors (Constructor can be overloaded)
- There are types of constructors in Java:
  a) Default constructor (non-parameterised constructor) - Constructor without argument.
  b) Parameterised constructor - Constructor with arguments
- If we don't write any constructor in a class, then JVM would provide default constructor.
- Access specifier of constructor should match with class acess specifier. e.g. If class is declared with "public" scope then constrcutor can be declared as "public".
- In Java there is NO copy constructor.
- Main use of constructor is to initialise data for an object which is being constructed.
- In case of inheritance, to call parent class constructor we use keyword "super".
- To call own (self) constructor we can use "this" keyword.

Ex.
class Student {
  int id;
  String name;
  Student() { } // Default constructor

  // Parameterised constructor
  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

Student s1 = new Student(); // Default constructor will be called
Student s2 = new Student(5, "Raj");


Stack v/s Heap memory:

For eavery java process dedicated memory is allocated (in MBs).
JVM would divide that memory into Stack and Heap.

What goes on Stack?
- For every function call stack frame gets created on Stack.
- Each stack frame contains local variables of that function including references.
- Stack frame gets deleted automatically when function is completed.
- First stack frame created on Stack is of "main()" function.

What goes in Heap?
- Class along with method definitions goes on Heap area.
- JVM would load class in Heap memory as and when needed (Lazy class loading)
- Objects created using "new" operator goes in Heap memory.
- Heap memory is cleaned up periodically by in-build process of JVM i.e. "Garbage Collection".

Reference v/s Object:
- We create object in java using "new"
e.g
    Student s1 = new Student()
- In this case, 
    s1 is a reference stored on Stack and it points to an object which is being created on Heap memory.
- Reference is kind of "pointer" which points to an object in heap memory.
- Value of reference is memory address.

Student s1 = new Student();
Student s2 = new Student();
Studnet s3;

In above example, there are 3 references(s1,s2,s3) and object count is 2. 

Which "Pass By" menchanism Java uses for Function calls?

    Java uses "Pass By Value" menchanism for function calls.

Static block:
- Static block can be declared within class with keyword "static".
- There can be more than one static blocks in one class.
- Static block gets executed only ONCE when class is loaded in the memory by JVM.
- It's guaranteed that static block will be executed only once.
- Logic which you want to execute only onces is generally added in static block.
    e.g.
        - Creating DB connection (JDBC)
        - It can be used to implement "Singleton" design pattern.
- Can we call function from static block?
        Yes. To call static funciton use class name.
             To call instance function create an object.
- If we have main() funcition and "static block" then which will get executed first?
    -> Static block will get executed before main() as it gets executed on class loading.

ex.
        class A {
            static {
                // code
            }
        }

Instance block:
- It's a block inside a class whihc doesn't have any name.
- It is written inside a class outside methods.
    e.g.
            class A {
                int a;

                {
                    // instance block
                }
                void fun() {
                    ...
                }
            }
- Instance block gets executed whenever new object is created.
- If we have constructor and instance block in a class, first instance block gets executed.
- Any common code you require to execute during initialisation can be added in instance block.
- It is also called as "Initialisation Instance Block" (IIB)




























