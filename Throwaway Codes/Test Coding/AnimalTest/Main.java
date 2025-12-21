import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        animal ani = new animal();
        dog doge = new dog();
        char op;
        int num;
        do{
            System.out.println("What op: ");
            op = sc.next().charAt(0);

            switch(op){
                case 'd':
                    ani.Sound();
                    break;
                
                case 'w':
                    doge.Sound();
                    break;

                case 'r':
                    doge.SoundofLitter();
                    break;

                case 'i':
                    System.out.print("What's the population size: ");
                    num = sc.nextInt();
                    doge.population(num);
                
                
            }
            
        }while(op != 'x');
        

        sc.close();
    }

    

}