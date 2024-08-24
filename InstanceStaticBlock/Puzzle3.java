class Puzzle3 {
    Puzzle3() { System.out.println("2");}
    { System.out.println("1");}
    
    static { System.out.println("8"); }
    public static void main(String[] args) {
        new A();
    }
}
class A {
    static {
        System.out.println("3");
        B obj = new B();
        System.out.println("4");
    }
    { 
        System.out.println("5");
        new Puzzle3();
    }
}
class B {
    B() { System.out.println("7");} 
    static { System.out.println("6");}
}
class C { 
    static { System.out.println("9");}
}