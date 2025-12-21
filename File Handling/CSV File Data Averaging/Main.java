// In the code editor, there is an existing code that creates three CSV files. 
// Your task is to write a program that asks for a file name, reads data from a 
// CSV file and calculates the average of a specific column. The program should 
// allow the user to specify the file name/path, the column to be averaged, and 
// the output format (integer or float).

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.*;

public class Main {

    // Function to create a CSV file with content if it does not already exist
    public static void createFileIfNotExists(String filename, String content) {
        File file = new File(filename);
        if (file.exists()) {
            return; // Skip creation if the file already exists
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error creating file " + filename + ": " + e.getMessage());
        }
    }

    // Function to create sample CSV files for testing
    public static void createSampleFiles() {
        createFileIfNotExists("sample1.csv", "ID,Name,Age\n1,John,30\n2,Jane,25\n3,Bob,40\n");
        createFileIfNotExists("sample2.csv", "Code,Description,Price\nA001,Product A,9.99\nB002,Product B,14.99\nC003,Product C,19.99\n");
        createFileIfNotExists("sample3.csv", "Country,Capital,Population\nUSA,Washington D.C.,328.2\nJapan,Tokyo,126.5\nFrance,Paris,66.99\n");
    }

    public static void main(String[] args) throws IOException{
        // Create sample files if they do not already exist
        createSampleFiles();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the CSV file name/path: ");
        String fileName = sc.nextLine();
        
        System.out.print("Enter the column to average (by header name): ");
        String col = sc.nextLine();
        
        System.out.print("Enter the output format (integer or float): ");
        String format = sc.nextLine();
        
        
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String head = read.readLine();
            String[] heads = head.split(",");
            
            int colIdx = -1;
            
            for(int i = 0; i < heads.length; i++){
                if(heads[i].trim().equalsIgnoreCase(col.trim())){
                    colIdx = i;
                    break;
                }
            }
            
            double sum = 0;
            int ctr = 0;
            
            String line;
            
            while((line = read.readLine()) != null){
                String[] sect = line.split(",");
                if(sect.length > colIdx){
                    double val = Double.parseDouble(sect[colIdx]);
                    sum += val;
                    ctr++;
                }
            }
            
            read.close();
            
            double res = sum / ctr;
            
            if(format.equalsIgnoreCase("integer")){
                System.out.printf("Average %s: %d", col, (int)res);
            }
            
            else{
                System.out.printf("Average %s: %.2f", col, res);
            }
        
        
        
        
        
    }
}