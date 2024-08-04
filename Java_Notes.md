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
