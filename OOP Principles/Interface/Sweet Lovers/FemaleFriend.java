//
public class FemaleFriend extends Friend implements GirlFriend{
    private int flowersReceived;
    private MaleFriend lover;
    
    
    
    public FemaleFriend(){
        super('F');
    }
    
    public void setLover(Lover lover){
        this.lover = (MaleFriend) lover;
    }
    

    public void giveLove(){
        System.out.println("tsuptsup");
        lover.receiveLove();
    }
    
    
    public void receiveFlowers(int flowerCount){
        this.flowersReceived += flowerCount;
        
    }
    
    
    
    
}