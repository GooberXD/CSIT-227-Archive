// Ask the user to input a size of a double array arr and its elements.

// Then, ask the user to input an integer x and print the element at x index with 2 decimal places.

// Use ArrayIndexOutOfBoundsException to catch the error and print the message "Index {x} is invalid." 
// if the error is caught.

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        
        int s = sc.nextInt();
        
        double[] arr = new double[s];
        
        for(int i = 0; i < s; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        
        System.out.print("Enter the index of the element to print: ");
        int index = sc.nextInt();
        
        try{
            System.out.printf("Element at index %d: %.2f", index, arr[index]);
        }
        
        catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Index %d is invalid.", index);    
        }
    }
}