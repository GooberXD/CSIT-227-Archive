import Aug14.Person;

// Woman is a subclass / derived class of Person
// Person is a superclass / base class of Woman
public class Woman extends Person {
    public void bePretty() {
        System.out.println("I look pretty " +
                "for the age of " + age);
    }
}
