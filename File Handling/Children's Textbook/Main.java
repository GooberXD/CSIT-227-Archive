// Write a program that continuously asks for a character input but 
// stops when the inputted character is neither a letter nor a number. 
// After stopping, create a text file named inputted.txt for the folder named letters. 
// Write the characters which are letters into this file. Then, create 
// a text file with the same name but inside the folder name numbers. 
// Finally, write the characters which are numbers into the latter text file. 
// Note that "/" is used for file location. Make sure to add a buffer size minimum of 1024.

// Sample Output:

// Enter a character: a
// Enter a character: 3
// Enter a character: X
// Enter a character: 4
// Enter a character: b
// Enter a character: Z
// Enter a character: 7
// Enter a character: y
// Enter a character: L
// Enter a character: 1
// Enter a character: @

import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int buffersize = 1024;
        
        StringBuilder let = new StringBuilder();
        StringBuilder num = new StringBuilder();
        
        while(true){
            System.out.print("Enter a character: ");
            char c = sc.next().charAt(0);
            
            if(Character.isLetterOrDigit(c) != true){
                break;
            }
            
            if(Character.isLetter(c) == true){
                let.append(c);
                
            }
            
            if(Character.isDigit(c) == true){
                num.append(c);
            }
            
        }
        //golders
        File letFold = new File("letters");
        if(!letFold.exists()){
            letFold.mkdirs();
        }
        
        File numFold = new File("numbers");
        if(!numFold.exists()){
            numFold.mkdirs();
        }
        
        File letFile = new File(letFold, "inputted.txt");
        File numFile = new File(numFold, "inputted.txt");
        
        
        BufferedWriter writerlet = new BufferedWriter(new FileWriter(letFile), buffersize);
        
        for(int i = 0; i < let.length(); i++){
            writerlet.write(let.charAt(i));
            writerlet.newLine();
        }
        writerlet.close();
        
        
        BufferedWriter writernum = new BufferedWriter(new FileWriter(numFile), buffersize);
        
        for(int i = 0; i < num.length(); i++){
            writernum.write(num.charAt(i));
            writernum.newLine();
        }
        writernum.close();
        
    }
}