interface A {
    int x = 10; // public static final
    void f1(); //  public abstract
}
class B implements A {
    public void f1() {
        System.out.println("B:f1");
    }
}
class InterfaceDemo {
    public static void main(String[] arsg) {
        System.out.println(A.x);
    }
}