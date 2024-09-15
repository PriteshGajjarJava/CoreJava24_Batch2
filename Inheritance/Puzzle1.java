class A1 {
    static { System.out.println("A1:static block");}
    A1() { System.out.println("A1:constructor");}
    { System.out.println("A1:instance block");}
}
class B1 extends A1 {
    static { System.out.println("B1:static block");}
    { System.out.println("B1:instance block");}
}
class C1 extends B1 {
    static { System.out.println("C1:static block");}
    C1() { System.out.println("C1:constructor");}
}
class Puzzle1 {
    public static void main(String[] args) {
        C1 obj = new C1();
    }
}