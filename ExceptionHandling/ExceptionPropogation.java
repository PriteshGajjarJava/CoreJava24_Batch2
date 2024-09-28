class ExceptionPropogation {
    public static void main(String[] args) {
        System.out.println("start main");
        f1();
        System.out.println("end main");
    }
    static void f1() {
        System.out.println("start f1");
        try {
            f2();
        }catch(ArithmeticException e) {
            System.out.println("AE occurred");
        }
        System.out.println("end f1");
    }
    static void f2() {
        System.out.println("start f2");
        System.out.println(9/0);
        System.out.println("end f2");
    }
}