// Abstract class representing an animal
abstract class Animal {
    // Abstract methods (must be implemented by subclasses)
    public abstract void animalSound();
    public abstract void testNoise();
    public abstract void mathTen(int i, int z);
    public abstract int multiply();

    // Regular method with default implementation
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherits from Animal)
class Pig extends Animal {

    private int cow = 90;
    private int cowettes = 100;

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
        System.out.println("I hate neck hurts");
    }

    @Override
    public void testNoise() { 
        System.out.println("I love cakes");
    }

    @Override
    public void mathTen(int i, int z) {
        System.out.printf("%d%n", i + z);
    }

    @Override
    public int multiply() {
        return cow * cowettes;
    }

    @Override
    public void sleep() {
        System.out.println("Pigs go oink sleep");
    }

    public void Origsleep() {
        super.sleep();
    }

}

// Main class
public class playground {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object

        myPig.animalSound();
        myPig.sleep();
        myPig.testNoise();
        myPig.mathTen(1, 3);

        myPig.sleep();
      
        myPig.Origsleep();

      

        System.out.printf("%d%n", myPig.multiply());
    }
}
