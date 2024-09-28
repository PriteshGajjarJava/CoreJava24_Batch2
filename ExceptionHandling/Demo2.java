import java.util.Scanner;
class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("Addition is:" +(a+b));
        try {
        System.out.println("Division is: " + (a/b));
        } catch(ArithmeticException e1) {
            System.out.println("Division error- / by zero");
        } finally {
            System.out.println("Subtraction: " + (a-b));
        }
        System.out.println("Multiplication is: " + (a*b));
    }
}