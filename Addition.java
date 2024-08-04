import java.util.Scanner;

public class Addition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter nubmer1 : ");
    int num1 = sc.nextInt(); 

    System.out.println("Enter nubmer2 : ");
    int num2 = sc.nextInt(); 

    int output = add(num1, num2);
    System.out.printf("Addition of %d and %d is: ", num1, num2, output);
  }

  static int add(int a, int b) {
    int ans = a + b;
    return ans;
  }

}