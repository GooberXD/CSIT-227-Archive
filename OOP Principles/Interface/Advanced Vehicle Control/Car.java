// Design a more complex interface for controlling various aspects of a vehicle. 
// For this program, you are tasked to define the following:

// Interface - VehicleControls:

// Methods:
// public void startEngine()
// public void stopEngine()
// public void turnOnHeadlights()
// public void turnOffHeadlights()
// public void honk()
 

// Class - Car:

// Implements the VehicleControls interface.
// Methods:
// Override all methods in VehicleControls to provide specific implementations:
// public void startEngine(): Prints "Engine started."
// public void stopEngine(): Prints "Engine stopped."
// public void turnOnHeadlights(): Prints "Headlights turned on."
// public void turnOffHeadlights(): Prints "Headlights turned off."

public class Car implements VehicleControls{
    
    public void startEngine(){
        System.out.println("Engine started.");
    }
    public void stopEngine(){
        System.out.println("Engine stopped.");
    }
    public void turnOnHeadlights(){
        System.out.println("Headlights turned on.");
    }
    public void turnOffHeadlights(){
        System.out.println("Headlights turned off.");
    }
    public void honk(){
        System.out.println("Horn sounds.");
    }

    
    
    
    
}