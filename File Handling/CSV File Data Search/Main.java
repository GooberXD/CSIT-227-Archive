// In the code editor, there is an existing code that creates CSV files. 
// Your task is to write a program that reads data from a CSV file and searches 
// for a specific value. The program should prompt to specify the file name/path, 
// the column to search in, and the value to search for. If the file does not exist, 
// print an error message "Error: File not found.". Also, if the search value is not found, 
// and for example the search value is "invalid", 
// print in the similar sample format: "No results found for value 'invalid'"

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    // Function to create sample CSV files for testing if they do not exist
    static void createSampleCsvFiles() {
        createCsvFileIfNotExists("file1.csv", "Name,Age,City\nJohn,25,New York\nJane,,San Francisco\nMike,35,\n");
        createCsvFileIfNotExists("file2.csv", "Name,Age,City\nAlice,20,Los Angeles\nBob,,Los Angeles\nCharlie,40,\n");
    }

    // Function to create a CSV file with content if it does not already exist
    static void createCsvFileIfNotExists(String filename, String content) {
        File file = new File(filename);
        if (file.exists()) {
            return; // Skip creation if the file already exists
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error creating file " + filename + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException{
        // Create sample CSV files only if they do not already exist
        createSampleCsvFiles();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        
        File file = new File(path);
        
        if(file.exists() != true){
            System.out.print("Error: File not found.");
            return;
        }
        
        System.out.print("Enter the value to search for: ");
        String value = sc.nextLine();
        
        BufferedReader read = new BufferedReader(new FileReader(file));
        
        read.readLine();
        boolean check = false;
        
        String line;
        
        while((line = read.readLine()) != null){
            if(line.toLowerCase().contains(value.toLowerCase())){
                if(check == false){
                    System.out.println("Results found for value '" + value + "': ");
                    System.out.println(line);
                    check = true;
                }
            }
        }
        if(check == false){
            System.out.println("No results found for value '" + value + "'");
        }
        
        
        
        
    }
}
