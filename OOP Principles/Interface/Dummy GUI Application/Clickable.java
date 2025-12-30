// A GUI Application is an application that has a user interface that 
// the user can interact with. For this program, you are tasked to define the following:

// Interface - Clickable:

// Method:
// public void click(): A method to simulate a click action.
 

// Interface - Resizable:

// Methods:
// public void resize(int newWidth, int newHeight): Resizes the component to 
// the specified width and height.
// public void resize(int multiplier): Resizes the component based on a multiplier.
 

// Abstract Class - AbstractButton (implements Clickable and Resizable):

// Protected Properties:
// protected String title
// protected int width
// protected int height
// protected boolean isClicked: Indicates whether the button has been clicked. 
// Defaults to false.
// Constructor:
// public AbstractButton(String title, int width, int height): Initializes 
// title, width, and height.
// Getter and Setter Methods: For title, width, and height.
 

// Class - Checkbox (implements Clickable):

// Private Property:
// private boolean isChecked: Indicates if the checkbox is checked. Defaults to false.
// private String text: The text associated with the checkbox.
// Constructor:
// public Checkbox(String text): Initializes text.
// Implemented click() Method:
// Toggles isChecked state and prints "Checkbox is checked" or "Checkbox is unchecked" 
// accordingly.
// toString() Method:
// @Override public String toString(): Returns a string in the format 
// "Checkbox ({text} - Checked = {isChecked})".
 

// Class - NormalButton (extends AbstractButton):

// Constructor:
// public NormalButton(String title, int width, int height): Calls the constructor of 
// AbstractButton.
// Implemented Methods:
// public void click(): Toggles isClicked state and prints "Button is clicked" 
// or "Button is not clicked anymore".
// public void resize(int newWidth, int newHeight): Resizes the button to the 
// specified newWidth and newHeight.
// public void resize(int multiplier): Resizes the button by multiplying 
// its width and height by multiplier.
// toString() Method:
// @Override public String toString(): Returns a string in the format 
// "NormalButton (({width}px, {height}px) - Clicked = {isClicked})".


public interface Clickable{
    
    public void click();
    
}