import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age; 
        String name, lastName = "";


        while (true) {

            try {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                
                int dot = name.indexOf('.');
                if(dot == -1){
                    throw new NameException(name);
                }

                lastName = name.substring(dot + 2);
                validateName(name);
                System.out.print("Enter age: ");
                age = sc.nextInt();
                
                break; 
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid age, input new");
                sc.nextLine();
            }

            catch (StringIndexOutOfBoundsException | NameException e) {
                System.out.println("Invalid name, input new");
            }

            finally {
                System.out.println("FINALLY");
            }

        }

        System.out.println("Your age is " + age);
        System.out.println(lastName + ", Your age is " + age);

        sc.close();

        
    }

    private static void validateName(String name) throws NameException{
            if(name.indexOf(' ') == name.lastIndexOf(' ')){
                throw new NameException(name);
            }
        }

}
