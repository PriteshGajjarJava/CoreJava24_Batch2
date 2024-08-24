class InstanceBlockDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(4);
    }
}
class A {
    {
        System.out.println("instance block1");
    }
        A() { System.out.println("A: default constructor"); }
    A(int n) { System.out.println("A: para constructor"); }
    {
        System.out.println("instance block2");
    }
}