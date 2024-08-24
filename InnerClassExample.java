// Member Inner class
class InnerClassExample {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner();
        System.out.println(obj1.x);
        System.out.println(obj2.y);
    }
}

class Outer {
    int x = 10;
     class Inner {
        int y = 20;
    }
}