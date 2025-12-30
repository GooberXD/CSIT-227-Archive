// Implement a simple music player using the concept of interfaces. 
// For this program, you are tasked to define the following:

// Interface - MusicControls:

// Methods:
// public void play(): Prints "Music is playing."
// public void pause(): Prints "Music is paused."
// public void stop(): Prints "Music has stopped."
 
// Class - BasicPlayer:

// Implements the MusicControls interface.
// Methods:
// Override play(), pause(), and stop() to provide the implementation as 
// described in the interface

public interface MusicControls{
    
    public void play();
    
    public void pause();
    
    public void stop();
    
}
