Constructor Chaining:
- In case of inheritance, when we create an object of child class then constructors are invoked from top to bottom. 

e.g.
class A {
    A() { System.out.println("A: constructor"); }
}
class B extends A {
    B() { System.out.println("B: constructor"); }
}
class ConstructorChain {
    public static void main(String[] args) {
        B obj = new B();
    }
}

o/p is :
A: constructor
B: constructor