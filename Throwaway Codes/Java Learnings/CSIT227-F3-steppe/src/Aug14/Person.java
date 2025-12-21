package Aug14;

public class Person {
    // FIELDS / INSTANCE VARIABLES
    public String name;
    protected int age;
    public static int count;

    // METHODS
    // CONSTRUCTOR
    public Person() {
        count++;
    }

    public static void walk() {
        int l;
        System.out.println("It is walking");
    }
}