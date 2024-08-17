class StudentDemo {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.id = 4; s1.name = "Abc";
    Student s2 = new Student(5, "Raj");

    System.out.println("s1 details: " + s1.id +"," +s1.name);
    System.out.println("s1 details: " + s2.id +"," +s2.name);
  }
}
class Student {
  // instance variable
  int id; 
  String name;
  Student() {
    System.out.println("Default constructor");
  }
  // id, name - Local variables
  Student(int id, String name) {
    System.out.println("Parameterised constructor");
    this.id = id;
    this.name = name;
  }
}