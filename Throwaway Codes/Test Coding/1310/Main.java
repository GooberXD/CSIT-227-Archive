import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// public class Main{
//     public static void main(String[] args){
//         List<Scanner> scanners = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);
//         try{
//             // while(true){
//             //     Scanner sc = new Scanner(System.in);
//             //     System.out.println(sc.hashCode());
//             //     scanners.add(sc);
//             // }
//             // h();
//         }

//         catch(OutOfMemoryError e){
//             System.out.println("Error caught");
//             // scanners.add(new Scanner(System.in));
//         }
        
        
//     }

//     private static void h(){
//         h();
//     }
// }


//sec

public class Main{
    public static void main(String[] args){
        BufferedReader br = null;
        BufferedWriter bw = null;

        try{

            File f = new File("1310/new");
            f.mkdir();
            br = new BufferedReader(new FileReader("chants.txt"));
            bw = new BufferedWriter(new FileWriter("chantsNew.txt"));

            System.out.println(br.readLine());

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            for(int i = 1; i <=15; i++){
                bw.write(i + " ");
                bw.newLine();

                if(i == 6){
                    int quo = i / 0;
                }

            }

        }
        
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        catch(IOException e){
            System.out.println("IO Gen Err");
        }

        finally {

            try{
                br.close();
                bw.close(); 
            }

            catch (IOException e){

            }
            
        }
        
        
    }

    private static void h(){
        h();
    }
}