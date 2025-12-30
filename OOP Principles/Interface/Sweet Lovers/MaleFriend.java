//
public class MaleFriend extends Friend implements BoyFriend{
    private int flowersGiven;
    private FemaleFriend lover;
    
    
    
    public MaleFriend(){
        super('M');
    }
    
    public void setLover(Lover lover){
        this.lover = (FemaleFriend) lover;
    }
    

    public void giveLove(){
        System.out.println("mwamwa");
        lover.receiveLove();
    }
    
    
    public void giveFlowers(int flowerCount){
        this.flowersGiven += flowerCount;
        lover.receiveFlowers(flowerCount);
    }
    
    
    
    
}