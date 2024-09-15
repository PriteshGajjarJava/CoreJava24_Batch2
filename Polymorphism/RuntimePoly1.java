class A {
    void f1() { System.out.println("A:f1");}
}
class B extends A {
    void f1() { System.out.println("B:f1");}
}
class RuntimePoly1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.f1();
        
        B obj2 = new B();
        obj2.f1();

        A obj3 = new B(); // For compiler type is "A", for runtime type is B. Method call will happend based on runtime type.
        obj3.f1();
    }
}
// output: A:f1 B:f1 B:f1