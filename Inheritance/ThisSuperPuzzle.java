class X {
    X() { System.out.println("1");}
    X(int x) { this(); System.out.println("2");}
}
class Y extends X {
    int y;
    Y() { System.out.println("7"); }
    Y(int x, int y) {
        super(x);
        System.out.println("3");
    }
}
class Z extends Y {
    int z;
    Z(int x) {
        super(x, 13);
        System.out.println("4");
    }
    Z(int x, int y) {
        this(x);
        System.out.println("5");
    }
    Z() { System.out.println("8"); }
    Z(int x, int y, int z) {
        this(x,y); System.out.println("6");
    }

}
class ThisSuperPuzzle {
    public static void main(String[] args) {
        Y obj1 = new Y(10,20);
        Z obj2 = new Z(1,2,3);
        Z obj3 = new Z();
    }
}