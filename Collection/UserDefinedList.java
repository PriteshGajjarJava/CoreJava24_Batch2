import java.util.*;
class Emp implements Comparable<Emp> {
    int id;
    String name;
    float salary;
    Emp(int id, String name, float salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public String toString() {
        return "[" + this.id +"," + this.name +","+this.salary +"]";
    }
    public int compareTo​(Emp e) {
        // 0, +1, -1
        Emp e1 = this;
        Emp e2 = e;
        return e1.id == e2.id ? 0 : e1.id > e2.id ? 1 : -1;
    }
}
class UserDefinedList {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        Emp e1 = new Emp(15, "Fred", 20000);
        Emp e2 = new Emp(5, "John", 31000); 
        Emp e3 = new Emp(10, "Rob", 12000);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Collections.sort(list);
        System.out.println(list);


    }
}
