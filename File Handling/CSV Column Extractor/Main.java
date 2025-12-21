// In the code editor, there is an existing code that creates three CSV files. 
// Your task is to write a program that takes a filename and a column number 
// as input, reads the file, and prints a list containing the values of the specified column.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        // initialize 3 test files with sample data
        List<List<String>> testData1 = new ArrayList<>();
        testData1.add(Arrays.asList("Name", "Age", "Gender"));
        testData1.add(Arrays.asList("John", "32", "Male"));
        testData1.add(Arrays.asList("Jane", "25", "Female"));
        testData1.add(Arrays.asList("Bob", "40", "Male"));

        List<List<String>> testData2 = new ArrayList<>();
        testData2.add(Arrays.asList("Name", "Age", "Gender"));
        testData2.add(Arrays.asList("Alice", "28", "Female"));
        testData2.add(Arrays.asList("Tom", "42", "Male"));
        testData2.add(Arrays.asList("Samantha", "33", "Female"));

        List<List<String>> testData3 = new ArrayList<>();
        testData3.add(Arrays.asList("Name", "Age", "Gender"));
        testData3.add(Arrays.asList("Michael", "45", "Male"));
        testData3.add(Arrays.asList("Emily", "29", "Female"));
        testData3.add(Arrays.asList("David", "37", "Male"));

        // write test data to files
        writeCsvFile("test_data_1.csv", testData1);
        writeCsvFile("test_data_2.csv", testData2);
        writeCsvFile("test_data_3.csv", testData3);
        
        
        System.out.print("Enter filename: ");
        String name = sc.nextLine();
        
        System.out.print("Enter column number: ");
        int col = sc.nextInt() - 1;
        
        List <String> colVaLUE = new ArrayList<>();
        
        BufferedReader read = new BufferedReader(new FileReader(name));
        
        String line;
        while((line = read.readLine()) != null){
            String[] sect = line.split(",");
            if(col < sect.length){
                colVaLUE.add(sect[col].replace("\"", "").trim());
            }
        }
        
        System.out.print(String.join(", ", colVaLUE));
        
        read.close();
    }

    static void writeCsvFile(String filename, List<List<String>> data) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (List<String> row : data) {
                for (int i = 0; i < row.size(); i++) {
                    writer.write("\"");
                    for (char c : row.get(i).toCharArray()) {
                        if (c == '\"') {
                            writer.write("\"\"");
                        } else {
                            writer.write(c);
                        }
                    }
                    writer.write("\"");
                    if (i < row.size() - 1) {
                        writer.write(",");
                    }
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}