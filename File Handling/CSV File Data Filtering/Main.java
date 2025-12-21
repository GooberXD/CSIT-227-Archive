// In the code editor, there is an existing code that creates three CSV files. 
// Your task is to write a program that asks for a file name then reads data 
// from a CSV file and filters it based on a specific condition. 
// The program should allow specifying the file name/path, the column to filter on,
//  and the condition to apply through inputs.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String[][] file1 = { { "Name", "Age", "City" }, { "John", "25", "New York" }, { "Jane", "30", "San Francisco" },
                { "Mike", "35", "Chicago" } };

        String[][] file2 = { { "Name", "Age", "City" }, { "Alice", "20", "Los Angeles" }, { "Bob", "30", "Los Angeles" },
                { "Charlie", "40", "New York" } };

        String[][] file3 = { { "Name", "Age", "City" }, { "David", "25", "Chicago" }, { "Eva", "30", "Los Angeles" },
                { "Frank", "35", "New York" } };

        // Write sample files
        try {
            writeCsvFile("file1.csv", file1);
            writeCsvFile("file2.csv", file2);
            writeCsvFile("file3.csv", file3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        
        System.out.print("Enter the column name to filter on: ");
        String col = sc.nextLine();
        
        System.out.print("Enter the condition to apply: ");
        String cond = sc.nextLine();
        
        
        BufferedReader read = new BufferedReader(new FileReader(path));
        
        String[] head = read.readLine().split(",");
        
        int idx = -1;
        
        for(int i = 0; i < head.length; i++){
            if(head[i].trim().equalsIgnoreCase(col)){
                idx = i;
            }
        }
        
        System.out.println("Rows that satisfy the condition: ");
        String line;
        
        
        while((line = read.readLine()) != null){
            String[] sect = line.split(",");
            
            if(idx < sect.length && sect[idx].trim().equals(cond)){
                System.out.println(String.join(",", sect));
                
            }
        }
    }
    
    static void writeCsvFile(String filename, String[][] data) throws IOException{
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (String[] row : data) {
                
                writer.println(String.join(",", row));
            }
        } 
    }
    
    
}