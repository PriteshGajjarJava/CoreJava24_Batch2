// #Example of calling static and instance methods:
// file name Test.java
// javac Test.jva
// java A1
class A1 {
  public static void main(String[] args) {
    System.out.println("Hello");
    // call static function
    B1.f1();
    // calling non-static (instance) functions
    C1 obj = new C1();
    obj.f2();
  }
}
class B1 {
  static void f1() {
    System.out.println("Good Morning!");
  }
}
class C1 {
   void f2() {
    System.out.println("Hava a nice Day!!!");
  }
}