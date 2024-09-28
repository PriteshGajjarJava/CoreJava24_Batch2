import java.io.*;
class CheckedExceptionDemo {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("Your name is: " + name);
    }
}
// Above program will give error like "Unreported exception IOException"
Solution 1: Handle IOException using try-catch
        try {
            String name = br.readLine();
            ...
        }catch(IOException e) {}

Solution 2: Ignore an exception by declaring "throws IOException" in method signature.
    public static void main(String[] args) throws IOException {}