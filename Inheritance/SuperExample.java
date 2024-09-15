class X {
    int x;
    X() { System.out.println("X:default");}
    X(int x) { this.x = x; System.out.println("X:Parameterised");}
    void fun() { System.out.println("X:fun");}
}
class Y extends X {
    int y;
    Y(int x, int y) {
        // super(x);
        System.out.println("Y:Parameterised");
        this.y = y;
    }
    void fun() {
        System.out.println("Y:fun");
        super.fun();
    }
}
class SuperExample {
    public static void main(String[] args) {
        Y obj = new Y(10,20);
        obj.fun();
    }
}