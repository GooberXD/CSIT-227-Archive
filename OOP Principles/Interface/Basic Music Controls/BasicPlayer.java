public class BasicPlayer implements MusicControls{
    
   @Override
   public void play(){
        System.out.println("Music is playing.");
        
    }
    
    @Override
    public void pause(){
        System.out.println("Music is paused.");
    }
    @Override

    public void stop(){
        System.out.println("Music has stopped.");
        
    }
    
}