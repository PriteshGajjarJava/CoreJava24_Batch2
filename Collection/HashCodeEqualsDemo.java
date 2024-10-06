import java.util.*;
class Emp {
    int id;
    String name;
    float salary;
    Emp(int id, String name, float salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public String toString() {
        return "[" + this.id +"," + this.name +","+this.salary +"]";
    }
    public int hashCode() {
        return (int)salary + (id * name.length());
    }
    public boolean equals(Object obj) {
        Emp e1 = this;
        Emp e2 = (Emp)obj;
        return e1.id == e2.id && e1.salary == e2.salary && e1.name.equals(e2.name);
    }
}

class HashCodeEqualsDemo {
    public static void main(String[] args) {
        Set<Emp> set = new HashSet<Emp>();
        Emp e1 = new Emp(14, "Raj", 10000);
        Emp e2 = new Emp(1, "Fred", 13000);
        Emp e3 = new Emp(7, "Sachin", 10000);//10000+42
        Emp e4 = new Emp(14, "Raj", 10000);
        set.add(e1);set.add(e2);set.add(e3);set.add(e4);
        Emp e5 = new Emp(1, "Fred", 13000);
        System.out.println(set.contains(e5));//true
        System.out.println(set);
    }
}