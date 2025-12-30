public class NormalButton extends AbstractButton{


    public NormalButton(String title, int width, int height){
        super(title, width, height);
    }
    
    
    @Override
    public void click(){
        
        if(getIsClicked() == false){
            isClicked = true;
            System.out.println("Button is clicked");
        }
        
        else if (getIsClicked() == true){
            isClicked = false;
            System.out.println("Button is not clicked");
        }
    }
    
    @Override

    public void resize(int newWidth, int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }
    
    @Override
    public void resize(int multiplier){
        this.width = width * multiplier;
        this.height = height * multiplier;
        
    }
    
    
    @Override
    
    public String toString(){
        return "NormalButton ((" + getWidth() + "px, " + getHeight() + "px) - Clicked = " + isClicked + ")";
    }
 
}