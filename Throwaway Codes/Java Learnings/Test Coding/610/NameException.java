public class NameException extends RuntimeException{
    
    public NameException(String name){
        super("Invalid name" + name);
    } 

}
