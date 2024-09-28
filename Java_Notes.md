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

Arrays:
- Array is collection of similar type of elements.
- Size of an array is fixed (static), we can not change size of an array later.
- "length" property can be used to derive size of an array.
- Array elements are accessed using "index"
- Array index starts from 0.
- Last elements can be accessed using arr[arr.length-1]

ex.
  int[] arr = new int[5];
  int[] arr = {1,3,4,5,2};
  String[] cities = new String[5];
  Student[] students = new Student[10];


String:

- String is sequence of characters.
- In java "String" is a class from "java.lang" package.
- We can create String in following ways.
    String s1 = "Java"; // It goes in "String literal pool"
    String s2 = new String("Java");
- String objects are "immutable".
  We can NOT modify string content directly. Any changes to string will result into new string.
  e.g.
      String s1 = "java";
      s1.toUpperCase();
      SOP(s1); // Output will be "java"

      If we have to change s1 to "JAVA" then code should be updated like below.
      String s1 = "java";
      s1 = s1.toUpperCase();
      SOP(s1); // Output will be "JAVA"

String Functions:

How to find length of String? => length()
String s = "Java";
int len = s.length(); // 4

How to get character by index? => charAt(int index)

String s = "Computer";
s.charAt(3); // index starts from 0 (Ans is 'p')

Case conversion. => toUpperCase(), toLowerCase()

Trimming => trim()
String s1 = "    ABC   PQR   "; //"ABC   PQR"
Search functions:
  1) indexOf(str)/lastIndexOf(str)
  2) contains()
e.g. String s = "Today is Sunday";
     int i = s.indexOf("day"); // 2
     int j = s.lastIndexOf("day"); // 12
     boolean b = s.contains("day"); // true
      int k = s.indexOf("Abc");// -1

Substring functions:
1) substring(startIndex)
2) substring(startIndex,endIndex)
String s = "Learning Java";
String str1 = s.substring(1); // "earning Java";
String str2 = s.substriing(1,5); // "earn"
  
Word operations:
In many cases we require to break string into words. => split()

String s1 = "Today is Sunday";
String[] words = s1.split(" ");// Splitting string by space
// output of above is words = ["Today", "is", "Sunday"]

Array of string to string?
e.g. String[] words = {"Today", "is", "Sunday"};
String s1 = String.join(" ", words); // "Today is Sunday"
String s2 = String.join("#", words); // "Today#is#Sunday"

Chracter array to String conversion?
char[] arr = {'j','a','v','a'};
String s = new String(arr); // "java"

String to chracter array?
String s = "java";
char[] arr = s.toCharArray(); // {'j','a','v','a'}

-------*****------------*****------------*****------------*****------------*****------------*****------------*

Inheritance:

- OOP concept
- It is relationship between two classes (parent and child).
- A child class can reuse propreties and functions from parent class.
- We can achieve "Reusability" principle using inheritance.
- It generally represents "IS-A" relationship.
- "extends" keyword is used to indicate this relationship.
e.g.
  class Person {}
  class Emp extends Person {}
- Child won't be able to access "private" properties/functions from parent class.
- "super" keyword is used in child class to refer parent class properties/functions/constructor.

Types of inheritance:
1) Single level inheritance
    class A {}
    class B extends A {}

2) Multi-level inheriance:
    class A {}
    class B extends A {}
    class C extends B {}

3) Hierarchical inheritance:
    class A {}
    class B extends A {}
    class C extends A {}
    class D extends B {}
    class E extends B {}

4) Multiple Inheritance:
  In Java multiple inheritance is NOT allowed with classes. It is allowed only with Interfaces.
    class A {}
    class B {}
    class C extends A, B {} ERROR

    interface A {}
    interface B {}
    class C implements A, B {} // ALLOWED  

Constructor Chaining:
- In case of inheritance, when we create an object of child class then constructors are invoked from top to bottom. 


"super" keyword:
- "super" keyword is used in child class to access parent class properties/functions.
- super.x => Accessing property named "x" from parent class.
- super.fun() => calling parent class function named fun()
- super() => Calling default constructor of parent
- super(para1,para2..) => Calling parameterised constructor of parent class
- Call to parent class constructor can be done ONLY from constructor of child class.

ex.
    class Person {
      String name;
      int age;
      Person() {}
      Person(String name, int age) { this.name = name; this.age = age; }
      void showDetails() { System.out.println("Name=" + this.name +", Age="+this.age);}
    }
    class Student extends Person {
      int rollNo;
      Student(int rollNo, String name, int age) {
        super(name, age); // call to parent class constructor
      }
      void showDetails() {
        System.out.println("Name=" + super.name); // accessing parent class property
        super.showDetails(); // calling parent class function
        System.out.println("RollNo" + this.rollNo); // accessing own property using "this" keyword.
      }
    }

1st line of any constructor is reserved to make call to parent class constructor.
JVM checks 1st line of constructor if call to parent class constructor is missing then JVM would add explicit call 
to a parent class constructor using "super()".

Following is ERROR scenario: Default constructor is missing in parent class.
class A{
  A(int x) { SOP("A:Constructor");}
}
class B extends A {
}

"this" keyword:
- Used to access own property/functions
- It can be used only in instance functions(including constructor)
- In static function we can NOT use "this" keyword.
- "this" is a reference(pointer) to current object.

class A {
  int x = 4;
  void fun(int x) {
    System.out.println(x); // 10 => Local variable "x"
    System.out.println(this.x); // 4 => instance variable "this.x"
  }
  public static void main(String[] args) {
    A obj = new A();
    obj.fun(10);
  }
}

- We can use "this" keyword to call constructor of own class(self constructor call).
- this() : To call default constructor of self.
  this(para1,..) : To call parameterised constructor of self.

  Polymorphism:

  - OOP concept
  - Meaning : One name many forms
  - There are 2 types of Polymorphism:
    a) Compile-time/static polymorphism
    b) Run-time/dynamic polymorphism
  - "Method Overloading" is an example of Compile-time polymorphism.
  - "Method Overriding" is an example of Run-time polymorphism.

Method Overloading:
- Type of polymorphism.
- Method overloading means more than one method with same name but with difference in parameters.
- Parameter difference can be of following:
  i) Parameter types are different
  ii) Parameter count is different
  iii) Parameter sequence is different
- Method overloading does NOT depends on return type.
- It is compile time polymorphism - because decision of which overloaded method to be called is taken at compile-time.
ex.
int add(int a, int b) {}
float add(float a, float b) {} // count of parameters is same but change in type
String add(String a, String b) {}
int add (int a, int b, int c) {} // count of parameter changes
String add (int a, String b) {}
String add (String a, int b) {} // sequnece of parameters changes

float add(int a, int b) {} ERROR => This conflicts with 1st function. Overloading does NOT depend on return type.


Method Overriding:
- Type of polymorphism.
- It represents "Run-time" Polymorphism.
- This concept can be seen only in inheritance (There has to be relationship)
- Using method overriding a child class can write exactly same method as of parent class with change in implementation.
- Method overriding means -> Method with same signature in child class.
- With the help of inheritance a child class always has an option of reusing parent class method. However for some reason if child class want to keep method name same and want to have own implemenation then child class can override parent class method.
- During overriding -> Child class MUST keep same signature.
- Two special cases during overriding:
  1) Changing scope/access-specifier of method
     A child class can increase the scope of method but can not decrease it.
    If method is declared with "public" then child must keep "public" scope
    If method is declared with "default" child can keep scope as "default", "protected" or "public" 
    
  2) "throws" keyword in signature:
     If parent class method has "throws" in signature then child class has following options:
      e.g void f() throws IOException {}
      a) Keep signature as is with "throws"
      b) Remove throws completely
      c) Exception type can be changed to a child exception class.

- In order to say method is overridden first condition is signature part, however more important condition is that "runtime" polymorphism behavior must exists between overridden methods.
- Following methods can NOT be overridden:
  a) static methods
  b) final methods
  c) private methods

  **Abstract class **

    Abstract method: It is a method which is declared using "abstract" keyword.
    Abstract method does NOT have deifinition and it ends with semicolon.
    Its mandatory for child class to override abstract method. So using "abstract method" a parent class can force child class to override particular method.

Abstract class:

    We can declare abstract class using "abstract" keywrod. e.g. abstract class A {}

    Abstract class can consist of abstract methods. It's not mandatory to have abstract methods in that class.

    Abstract class can NOT be instantiated(We can NOT create object of abstract class)

    When a child class inherits an abstract class, child class MUST override all abstract methods from parent class.

    If child class fails to override any of abstract methods from parent, then that child class also can be declared as abstract class.

    Even if we can not create object of abstract class, still it can have constrcutor. Constructor of abstract class will be called when we create object of child class.

    Abstract class can also have it's own properties(instance/static) which can be accessed using a child class.

Interface:

- It's a type in Java declared using "interface" keyword.
	e.g.
	interface A {}
	
- All variables of interface are by default "public static final"

- All methods of interface are by defaute "public abstract"

- As all methods of interface are abstract we don't have to use abstract keyword (it's optional)

- Main purpose of an interface is to define a CONTRACT, which child class can implement.

- A child class can inherite an interface usign "implements" keyword.

- Multiple inheritance is possible with interfaces. Onc class can inherit more than one interfaces.
	
  e.g.
  	interface A {}
	interface B {}
	class C implements A, B {}
	
- Interface can NOT be instantiated. (we can not create object of interface)
- Interface does NOT have instance properties(only static properties are allowed)
- We can NOT have constructor in interface.

Ex of interfaces: Runnable, Map, List, Set

Marker/Tagging interfaces:
- Special in-built interfaces in java which does NOT have any methods. They are used to tag
special features which JVM understands.
e.g. To implement clonining your class must inherit marker interface named "Cloneable"
To do serialization in your class, you must inherit marker interface named "Serializable"

Abstract Class v/s Interface:


            Abstract class            Interfaces

1) "abstract" keywrod is used       "interface" keyword is used.
e.g. abstract class A {}            interface A {}

2) To inherit abstract class        To inherit interface, we will use "implements" keyword
we will use "extends" keyword 

3) Constructor - YES                No constructor

4) It can have both abstract &      All Interface methods are by defeault "abstract" methods.
non-abstract methods.

5) Static/instance properties-YES   Only static properties are allowed with "final" keyword(constant)

6) Multiple inhertiance is NOT      Multiple inheritance is possible.
possible.

Exception Handling:

There are 2 types of errors.

- Compilation errors e.g. Syntax error (semicolon missing, bracket missing, wrong function name etc)
- Runtime errors These errors occurs at runtime due to some programming mistake or user input.

Exception:
Exception is runtime error which causes program to terminate abnormally.
If exception occurs at runtime and if it's not handled then program is terminated.

If there are 10 lines and exception occurs at 3rd line (and if it's not handled), program will be terminated and lines from 4-10 are not executed.

How to handle Exceptions?
Solution is : Use "try-catch-finally" block.
e.g
class Demo1 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] a = {1,2,3,4,5};
        System.out.println(a[1]);

        try {
            System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed..");
        }

        System.out.println(a[3]);
        System.out.println("End");
    }
}

What happens when exception is detected?
- Whenever exception occurs, JVM identifies type of an exception. After identifying type of an exception, JVM would create an object of particular exception and throws exception object.
- JVM checks if that particular exception is handled by your code:
    If Yes -> JVM will go into "catch" block
    If No -> Program will be terminated.
    

**How to handle Exceptions?**    
`Java provides try-catch-finally blocks to do exception handling.`

1) "try" block
In try block we write lines where there is chance of an exception. Ideally we should keep minimal code in "try" block.

 "try" block Syntax:
    try { // lines of code where there is possiblity of an exception }


2) "catch" block
"catch" block is an exception handler block which gets executed ONLY when exception occurs. We can write multiple catch blocks with try. If exception occurs, JVM would find best matching catch block based on exception and only one catch block will be executed.
Order of multiple catch block must be child and then later parent. (Parent at bottom)

Syntax: catch(<Exception-class> obj) { // Exception handling logic }


3)"finally" block
Syntax: finally { // Code which you want to execute in both scenarios success/failure. }

With try-catch pair, we can add at most one "finally" block.(It's optional).
"finally" block gets executed in both failure/success scenarios.
Generally logic of cleanup is written in "finally" block.
e.g Closing DB connection, Closing File, Closing socket etc.

Two conditions where "finally" will NOT be executed:
  -  If "try" block is not hit
  -  If it encounters `System.exit(0)` before reaching finally block.

Possible combinations of try-catch-finally:
   1) try-catch
   2) try-multiple catch blocks
   3) try-catch-finally
   4) try-multiple catch - finally
   5) try-finally


**Example of exceptions:**
`ArrayIndexOutOfBoundsException`
  int[] arr = {2,4,5};
  SOP(arr[9]);

`NullPointerException`
  String s = null;
  System.out.println(s.length()); // NPE: NullPointerException

`ArithmeticException`
  System.out.println(9/0); // ArithmeticException

`StringIndexOutOfBoundsException`
  String s = "one";
  System.out.println(s.charAt(5));// StringIndexOutOfBoundsException

`NumberFormatException`
  String s = "one";
  int i = Integer.parseInt(s); // NFE: NumberFormatException

Exception classes Hierarchy:

"Throwable" is parent class of all exception classes.
Top level hierarchy looks like below:

        Throwable

    Error           Exception

              RuntimeExcepiton

Exception under "Error" class are most critical and can not be handled programmatically.
e.g. VirtualMachineError (JVM crash), OutOfMemoryError(Heap memory exhausted)

There are two categories of exceptions:
a) Checked Exception
b) Unchecked exceptions

Checked exceptions:
- More critical
- Parent of these exceptions is "Exception" class
- Compiler enforces to handle these exception if any code is encountered which warns about checked exception.
- Example: ServletException, ClassNotFoundException, IOException, FileNotFoundException, SQLException etc.

UnChecked Exceptions:
- Less critical
- Parent is "RuntimeException"
- Compiler does NOT enforces to handled these exceptions.
- Ex. ArithmeticException, NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException etc.

"throws" keyword:
- This keyword is used with method signature.
syntax: fun() throws <CheckedException1>, <CheckedException2>...
e.g.
    public void fun() throws IOException, SQLException {}

- Using "throws" function owner tells outside world about possibility of a particular exception.
e.g.
    public void readStudentData(int rollNo) throws SQLException  { ... }
In above function there is possibility of "SQLException" if invalid roll number is passed (Query will fail).

- Compiler enforces consumer who calls such functions (Function having "throws" in signature) to handled exception written with "throws".
Conusmer has 2 choices:
1) Handle an exception using try-catch
2) Ignore an exception by writing same exception in their own method signature using "throws"

"throw" keyword:
- Using "throw" keyword we can explicitly create an object of an exception and throw that exception.
- In some situations we have to throw an exception to the caller as caller has passed wrong input.
e.g.

    public void validatePin(int pin) throws InvalidPINException {
        // code to check pin validity
        boolean isPinValid = checkPin();
        if (!isValid) {
          throw new InvalidPINException();
          // explicitly throwing an exception (In this case "InvalidPINException" is our own custom exception class)
        }
        ...
    }
 - "throw" syntax:  throw new <CheckedExceptionClass>();

 Example of User defined Exceptions:
 - Java allows us to write our own exception classes.
 - Mandatory step to define our own exception is - Class must extends "Exception" class.
 e.g

 "Exception Propogation"
 - Whenever exception occurs JVM checks if exception is handled in current 
 function. 
 - If exception is NOT handled in current function then it is passed to 
 previous function(caller).
 - This chain continues till JVM.
  
    JVM -> main() -> f1() -> f2()
Exception "AE" occurred in f2();
AE will get propogated in sequence f2() -> f1() -> main() -> JVM

Nested try-catch-finally block:


  try {
    ...
    ...
    try {
      ....
    }catch(ArithmeticException e2) {
      ...
    }
    ...
  }catch(Exception e1) {
      ...
      try {
        ...
      } catch {AIOBBE e1}
  }