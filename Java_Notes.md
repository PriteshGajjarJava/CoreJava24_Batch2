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
