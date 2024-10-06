import java.util.*;
class IdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.id == s2.id ? 0 : s1.id>s2.id ? 1 : -1;
    }
}
class MarksComparator implements Comparator<Student> { 
    public int compare(Student s1, Student s2) {
        return s1.marks == s2.marks ? 0 : s1.marks>s2.marks ? -1: 1;
    }
}
class NameComparator implements Comparator<Student> { 
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
class Student {
    int id; String name; float marks;
    Student(int id, String name, float marks) {
        this.id = id; this.name = name; this.marks = marks;
    }
    public String toString() {
        return "["+this.id +","+this.name+","+this.marks+"]";
    }
}
class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(15, "Raj", 47));
        list.add(new Student(4, "Vijay", 79));
        list.add(new Student(10, "Sachin", 84));

        List<Student> listByMarks = new ArrayList<Student>(list);
        List<Student> listByName = new ArrayList<Student>(list);

        Collections.sort(list, new IdComparator());
        Collections.sort(listByMarks, new MarksComparator());
        Collections.sort(listByName, new NameComparator());

        System.out.println(list);
        System.out.println(listByMarks);
        System.out.println(listByName);

    }
}