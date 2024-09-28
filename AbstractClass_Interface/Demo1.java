abstract class A {
    int x;
    A() { System.out.println("A: constructor");}
    abstract void f1();
    void f2() {
        System.out.println("F2");
    }
}
class B extends A {
    B() { System.out.println("B:constructor");}
    void f1() { System.out.println("B:f1"); }
}
class Demo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x = 12;
        obj.f1();
        obj.f2();
    }
}