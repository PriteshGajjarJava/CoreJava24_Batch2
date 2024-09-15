// Polymorphism: Method overloading, Method overring, Runtime Polymorphis
class Fruit {
    static { System.out.println("4");}
    Fruit() { System.out.println("3"); }
}
class Mango extends Fruit {
    Mango() { System.out.println("1"); }
}
class Banana extends Fruit {
    static { System.out.println("5");}
    Banana() { System.out.println("2"); }
}
class Puzzle2 extends Mango {
    public static void main(String[] args) {
        Banana b1 = new Banana();
    }
}