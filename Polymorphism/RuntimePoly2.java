class X {
    void f1() { System.out.println("X:f1");}
    void f2() { System.out.println("X:f2");}
}
class Y extends X {
    void f2() { System.out.println("Y:f2");}
    void f3() { System.out.println("Y:f3");}
}
class Z extends Y {
    void f1() { System.out.println("Z:f1");}
    void f4() { System.out.println("Z:f4");}
}
class RuntimePoly2 {
    public static void main(String[] args) {
        Y obj1 = new Z();
        obj1.f1();
        obj1.f2();
        obj1.f3();
        ((Z)obj1).f4(); // Explicit Downcasting

        X obj2 = new Y();
        obj2.f1();
        obj2.f2();
        // obj2.f3();
    }
}