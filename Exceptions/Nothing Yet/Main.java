// A String variable named myString is initially set to null.

// Ask the user to input a string. If the input does not start or end with a hyphen (-), 
// assign the input to myString.

// Then, in a try block, print the uppercase version of myString using the toUpperCase() method.

// If a NullPointerException occurs (i.e., myString is still null), catch it and print: 
// myString is still null

// In all cases, whether or not an exception is thrown, print the following message in a 
// finally block: Everything's over

 

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String myString = null;
        
        System.out.print("Enter a string: ");
        String str = s.nextLine();
        
        if((str.startsWith("-") || str.endsWith("-")) == false){
            myString = str;
        }
        
        try{
            System.out.println(myString.toUpperCase());
        }
        
        catch(NullPointerException e){
            System.out.println("myString is still null");
        }
        
        finally{
            System.out.println("Everything's over");
        }

        s.close();
    }
}

//alt solution
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a string: ");
        
//         String str = sc.nextLine();
        
//         String myString = null;
        
//         if(!(str.startsWith("-") || str.endsWith("-"))){
//             myString = str;
//         }
        
        
//         try{
//             System.out.println(myString.toUpperCase());
//         }
        
//         catch (NullPointerException e){
//             System.out.println("myString is still null");
//         }
        
//         finally{
//             System.out.println("Everything's over");
//         }
//     }
// }