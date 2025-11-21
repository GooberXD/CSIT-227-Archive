public class dog extends animal{
    public int litterSize;
    
    public void Sound(){
        System.out.println("Woof woof motherfucker");
    }

    public void population(int litterSize){
        this.litterSize = litterSize;
    }

    public void SoundofLitter(){
        for(int i = 0; i < litterSize; i++){
            System.out.printf("Woof woof motherfucker %d again\n", i + 1);
        }
    }
}
