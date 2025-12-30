// How sweet it is to witness two friends become one when they become lovers and get married? 
// Let's implement classes that way. For this program, you are tasked to define the following:

// Interface - Lover:

// Methods:
// void setLover(Lover lover): Sets the lover for the current object.
// void receiveLove(): Simulates the action of receiving love.
// void giveLove(): Simulates the action of giving love.
 

// Abstract Class - Friend (implements Lover):

// Private Properties:
// private char gender: The gender of the friend.
// private boolean isLoved: Indicates if the friend is loved, initially false.
// Constructor:
// public Friend(char gender): Initializes the gender property.
// Implemented receiveLove() Method:
// Sets isLoved to true.
// toString() Method:
// Prints and returns a string in the format: "<gender> - <isLoved>".
 

// Interface - BoyFriend:

// Method:
// void giveFlowers(int flowerCount): Simulates giving flowers.
 

// Interface - GirlFriend:

// Method:
// void receiveFlowers(int flowerCount): Simulates receiving flowers.
 

// Class - MaleFriend (extends Friend, implements BoyFriend):

// Private Properties:
// private int flowersGiven: The number of flowers given.
// private FemaleFriend lover: The female friend who is the lover.
// Constructor:
// public MaleFriend(): Initializes a male friend with gender 'M'.
// Implemented Methods:
// public void setLover(Lover lover): Sets the lover.
// public void giveLove(): Prints "mwamwa" and invokes lover.receiveLove().
// public void giveFlowers(int flowerCount): Increases flowersGiven and invokes 
// lover.receiveFlowers(flowerCount).
 

// Class - FemaleFriend (extends Friend, implements GirlFriend):

// Private Properties:
// private int flowersReceived: The number of flowers received.
// private MaleFriend lover: The male friend who is the lover.
// Constructor:
// public FemaleFriend(): Initializes a female friend with gender 'F'.
// Implemented Methods:
// public void setLover(Lover lover): Sets the lover.
// public void giveLove(): Prints "tsuptsup" and invokes lover.receiveLove().
// public void receiveFlowers(int flowerCount): Increases flowersReceived.


public interface Lover{
    
    public void setLover(Lover lover);
    
    public void receiveLove();
    
    public void giveLove();
    
    
}