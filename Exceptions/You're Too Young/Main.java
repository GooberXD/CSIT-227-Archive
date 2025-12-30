// Create a custom exception class AgeException. No need to create nor modify other files.

// Class - AgeException extends Exception:

// Constructor:
// public AgeException(int age): Calls the constructor of Exception using super() 
// to set a default error message. Uses super() to set the exception message to 
// "Age {age} is too young."

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) {
                throw new AgeException(age);
            }
            System.out.println("User is eligible.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            int age = 18;
            if (age < 18) {
                throw new AgeException(age);
            }
            System.out.println("User is eligible.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}