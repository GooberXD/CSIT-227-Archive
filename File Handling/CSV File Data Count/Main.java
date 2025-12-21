// In the code editor, there is an existing code that creates three CSV files. 
// Your task is to write a program that reads a CSV file and counts the number 
// of rows and columns of data. The program should prompt to enter the 
// filename/path of the CSV file, and then output the number of rows and 
// columns of data in the file. If the file does not exist, 
// print an error message "Error: File not found."

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    // Function to create a CSV file with content if it does not already exist
    static void createCsvFileIfNotExists(String filename, String content) {
        File file = new File(filename);
        if (file.exists()) {
            return; // Skip creation if the file already exists
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error creating file " + filename + ": " + e.getMessage());
        }
    }

    // Function to create sample CSV files for testing if they do not exist
    static void createSampleCsvFiles() {
        createCsvFileIfNotExists("file1.csv", "Name,Age,Gender\nAlice,25,Female\nBob,30,Male\n");
        createCsvFileIfNotExists("file2.csv", "ID,Name,Age,Gender\n1,Alice,25,Female\n2,Bob,30,Male\n3,Charlie,35,Male\n");
        createCsvFileIfNotExists("file3.csv", "Name,Age,Gender,Height,Weight\nAlice,25,Female,1.68,60.0\nBob,30,Male,1.75,75.5\nCharlie,35,Male,1.80,80.0\nDavid,40,Male,1.83,85.5\nEmily,45,Female,1.70,65.5\n");
    }
    
    
    
    //main
    public static void main(String[] args) throws IOException{
        // Create sample CSV files only if they do not already exist
        Scanner sc = new Scanner(System.in);
        createSampleCsvFiles();
        int rowCtr = 0;
        int colCtr = 0;
        
        
        System.out.print("Enter the filename/path of the CSV file: ");
        String csvFile = sc.nextLine();
        
        File file = new File(csvFile);
        
        if(file.exists() != true){
            System.out.print("Error: File not found.");
            return;
        }
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String head = br.readLine();
        
        if(head != null){
            String[] h = head.split(",");
            colCtr = h.length;
        }
        
        while(br.readLine() != null){
            rowCtr++;
        }
        
        System.out.println(csvFile + " contains " + rowCtr + " rows and " + colCtr + " columns of data.");
     
        
    }
    
    
    
}