public abstract class AbstractButton implements Clickable, Resizable{
    protected String title;
    protected int width;
    protected int height;
    protected boolean isClicked = false;

    public AbstractButton(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    
    public String getTitle(){
        return title;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
 
    public boolean getIsClicked(){
        return isClicked;
    }
    
}