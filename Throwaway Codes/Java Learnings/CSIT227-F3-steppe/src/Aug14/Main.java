package Aug14;

import java.time.Month;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int happiness;
        happiness = 99;

        Scanner sc = new Scanner(System.in);
        Person p = new Person(); // Person() is a constructor
        p.name = "Vince";
        p.age = 20;
        Person h = new Person();
        h.name = "Jean";
        System.out.println(p.name + " " + p.age + " " + p.count);
        Person k = new Person();
        System.out.println(h.name + " " + h.age + " " + p.count);
        System.out.println(k.name + " " + k.age + " " + p.count);
        Person.walk();
        System.out.println(Math.sqrt(4));
        h.walk();
    }

}
