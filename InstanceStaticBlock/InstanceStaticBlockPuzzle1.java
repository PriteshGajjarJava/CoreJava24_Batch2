class InstanceStaticBlockPuzzle1 {
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        A obj1 = new A();
        InstanceStaticBlockPuzzle1 obj2 = new InstanceStaticBlockPuzzle1();
         A obj3 = new A();
    }
}
class A {
    { System.out.println("4");}

    A() { System.out.println("5");}

    static {
        System.out.println("3");
    }
}
