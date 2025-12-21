// Write a program that asks for an integer n followed by n names and save 
// these names in the text file called people.txt. It is equired that there 
// are no duplicate names before saving. Make sure to add a buffer size minimum of 1024.

// Sample Output:

// Enter the number of names: 5
// Enter name 1: Alice
// Enter name 2: Bob
// Enter name 3: Alice
// Enter name 4: Charlie
// Enter name 5: David

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int buffersize = 1024;
        
        int n;
        
        System.out.print("Enter the number of names: ");
        n = sc.nextInt();
        sc.nextLine();
        
        List<String> names = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.printf("Enter name %d: ", i + 1);
            String name = sc.nextLine();
            
            if(names.contains(name) == false){
                names.add(name);
            }
        }
        
        File f = new File("people.txt");
        
        BufferedWriter w = new BufferedWriter(new FileWriter(f), buffersize);
        
        for(String name : names) {
            
            w.write(name);
            w.newLine();
            
        }
        
        w.close();
        
    }
}
