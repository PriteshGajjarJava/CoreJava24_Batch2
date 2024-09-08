public class UserDefinedTypeArray {
    public static void main(String[] args) {
        Emp[] emp = new Emp[3];
        emp[0] = new Emp(11, "Fred", 20000);
        emp[1] = new Emp(12, "Abc", 15000);
        emp[2] = new Emp(13, "Rajesh", 19000);

        for (Emp e : emp) {
            System.out.println(e.id +","+e.name+","+e.salary);
        }

    }
}

class Emp {
    int id;
    String name;
    float salary;
    Emp() {}
    Emp(int id, String name, float salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
}