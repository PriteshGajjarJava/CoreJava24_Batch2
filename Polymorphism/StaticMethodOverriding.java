class A1 {
    static void f1() { System.out.println("A:f1"); }
}
class B1 extends A1 {
    static void f1() { System.out.println("B:f1"); }
}

class StaticMethodOverriding {
    public static void main(String[] args) {
        A1 obj = new B1();
        obj.f1();
    }
}