// Ask the user to input two integers, a and b. Print the quotient on the next line by dividing a by b. 
// Make sure to catch the exception though in case a is divided by 0 using the ArithmeticException class. 
// If an exception is caught, print "Invalid division".

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        try{
            
            System.out.print("Enter the value of a: ");
            int a = s.nextInt();
            
            System.out.print("Enter the value of b: ");
            int b = s.nextInt();
            
            System.out.print("Quotient: " + a / b);
            
        }
        
        catch(ArithmeticException e){
            System.out.print("Invalid division");
        }
    }
}

//alt solution
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         try{
            
//             System.out.print("Enter the value of a: ");
//             int a = sc.nextInt();
            
//             System.out.print("Enter the value of b: ");
//             int b = sc.nextInt();
            
//             System.out.printf("Quotient: %d", a / b);
            
//         }
        
//         catch (ArithmeticException e){
//             System.out.println("Invalid division");
//         }
        
//     }
    
    
// }