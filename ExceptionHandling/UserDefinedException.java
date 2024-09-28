
 Example of User defined Exceptions:
 - Java allows us to write our own exception classes.
 - Mandatory step to define our own exception is - Class must extends "Exception" class.
 e.g

import java.util.Scanner;

class AgeInvalidException extends Exception {} // User defined exception class

class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch(AgeInvalidException e) {
            System.out.println("Entered age is Invalid. Please pass age between 1-100");
        }
        System.out.println("****END****");
    }
    static void validateAge(int age) throws AgeInvalidException {
        // 1-100
        if (age >=1 && age <=100) {
            System.out.println("Age is valid");
        } else {
            throw new AgeInvalidException();
        }
    }
}