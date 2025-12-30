public class Checkbox implements Clickable{
    private boolean isChecked = false;
    private String text;

    public Checkbox(String text){
        this.text = text;
    }
    
    
    @Override
    public void click(){
        
        if(getIsChecked() == false){
            isChecked = true;
            System.out.println("Checkbox is checked");
        }
        
        else if(getIsChecked() == true){
            isChecked = false;
            System.out.println("Checkbox is unchecked");
        }
    }
    
    public boolean getIsChecked(){
        return isChecked;
    }
    
    @Override
    public String toString(){
        return "Checkbox (" + text + " - Checked = " + isChecked + ")";
    }
 
    
    
}