public abstract class Friend implements Lover{
    private char gender;
    private boolean isLoved = false;
    
    public Friend(char gender){
        this.gender = gender;
    }
    
    
    public void receiveLove(){
        this.isLoved = true;
    }
    
    public String toString(){
        return gender + " - " + isLoved;
    }
    
    
}