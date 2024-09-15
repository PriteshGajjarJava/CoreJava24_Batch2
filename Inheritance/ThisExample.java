class Product {
    int id;
    String name;
    float price;
    float discount;

    Product() {
        System.out.println("Default");
    }
    Product(float price, float discount) {
        this();
        System.out.println("Parameterised 1");

        this.price = price; this.discount = discount;
    }
    Product(int id, String name, float price, float discount) {
        this(price, discount);
        System.out.println("Parameterised 2");
        this.id = id;
        this.name = name;
    }
}
class ThisExample {
    public static void main(String[] args) {
        Product p1 = new Product(11, "P11", 100, 10);
    }
}