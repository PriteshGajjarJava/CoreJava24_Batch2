class A {
    static { System.out.println("A:static");}
    A() { System.out.println("A:constructor");}
}
class B {
    { System.out.println("B:instance");}
    static { System.out.println("B:static"); }
    B() {
        System.out.println("B:constructor");
        A obj = new A();
    }
}
class BlockPuzzle2 {
    public static void main(String[] args) {
        new B();
    }
}