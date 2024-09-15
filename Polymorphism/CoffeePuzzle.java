class Beverage {
    void prepare() {
        System.out.println("Beverage: Sugar");
        this.addMilk();
    }
    void addMilk() {
        System.out.println("Beverage: milk");
    }
}
class Coffee extends Beverage {
  void addMilk() {
        System.out.println("Coffee: milk");
    }
}
class CoffeePuzzle {
    public static void main(String[] args) {
        Beverage b = new Coffee();
        b.prepare();
    }
}