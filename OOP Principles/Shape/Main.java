//INHERITANCE AND POLYMORPHISM
// All the shapes have area and a perimeter, however their calculation 
// is based on the shape itself. This means to say that there is a different formula 
// as to calculating the area of a rectangle and a circle, for example.

// In this problem, you will be calculating the area and perimeter of a Rectangle,
// Square, Ellipse, Circle, Triangle and an Equilateral Triangle. 
// One of these shapes will be used as the first input of this problem.

// For the classes, create an abstract class Shape and abstract methods to 
// calculate the area and perimeter. In this class, there is only one 
// field deemed common to all shapes: color. This will be used in the 
// toString as shown in the code. Your subclasses must only declare 
// one constructor as it shall be the only way to create that shape. 
// Your subclasses should override the toString method to append the shape 
// ("which is also " a/an [shape]). 

// In the main function, you should correctly prompt the user for the input. 
// Assume all numerical inputs are floating-point decimal numbers. 

// (1) The Rectangle Class
// In a Rectangle, you will be provided the following 3 inputs: 
// the length, width, and the color of the rectangle. The rectangle's area is 
// length * width and its perimeter is 2 * length + 2 * width.

// In a Square, you are only provided 2 inputs, the value of the side 
// and the color of the square. Its area is side squared, and its perimeter is 4 * side.

 
// (2) The Ellipse Class
// Make an Ellipse class and a Circle class. Note that the perimeter here is its circumference.
// In an Ellipse, you will be provided the following 3 inputs: 
// the value of a, the value of b, and the color of the ellipse.

// In a Circle, you are only provided 2 inputs, the radius and the color of the circle.
// For the value of Pi, set it as a final variable with the value 3.14159.

import java.util.Scanner;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape: ");
        String option = sc.nextLine();
        double len, wid, side, base, height, a, b, c, r;
        Class<?> clazz;
        Constructor<?>[] declaredConstructors;
        String color;
        switch (option) {
            case "Rectangle":
                System.out.print("Enter length: ");
                len = sc.nextDouble();
                System.out.print("Enter width: ");
                wid = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Rectangle(len, wid, color);
                break;
            case "Square":
                System.out.print("Enter side: ");
                side = sc.nextDouble();
                System.out.print("Enter color: ");
                sc.nextLine();
                color = sc.nextLine();
                shape = new Square(side, color);
                break;
            case "Ellipse":
                System.out.print("Enter semimajor axis: ");
                a = sc.nextDouble();
                System.out.print("Enter semiminor axis: ");
                b = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Ellipse(a, b, color);
                break;
            case "Circle":
                System.out.print("Enter radius: ");
                r = sc.nextDouble();
                System.out.print("Enter color: ");
                sc.nextLine();
                color = sc.nextLine();
                shape = new Circle(r, color);
                break;
            case "Triangle":
                System.out.print("Enter base: ");
                base = sc.nextDouble();
                System.out.print("Enter height: ");
                height = sc.nextDouble();
                System.out.print("Enter side a: ");
                a = sc.nextDouble();
                System.out.print("Enter side c: ");
                c = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                color = sc.nextLine();
                shape = new Triangle(base, height, a, c, color);
                break;
            case "EquilateralTriangle":
                System.out.print("Enter side");
                side = sc.nextDouble();
                System.out.print("Enter color: ");
                sc.nextLine();
                color = sc.nextLine();
                shape = new EquilateralTriangle(side, color);
                break;
            case "CheckSquare":
                Square s = new Square(0, "");
                if (s instanceof Rectangle) {
                    System.out.println("Square is a Rectangle");
                }
                return;
            case "CheckCircle":
                Circle cir = new Circle(0, "");
                if (cir instanceof Ellipse) {
                    System.out.println("Circle is an Ellipse");
                }
                return;
            case "CheckEquilateralTriangle":
                EquilateralTriangle et = new EquilateralTriangle(0, "");
                if (et instanceof Triangle) {
                    System.out.println("Equilateral Triangle is a Triangle");
                }
                return;
            case "CheckConstructor1":
                clazz = Rectangle.class;
                declaredConstructors = clazz.getDeclaredConstructors();
                System.out.println("Number of declared constructors for Rectangle: " + declaredConstructors.length);
                return;
            case "CheckConstructor2":
                clazz = Ellipse.class;
                declaredConstructors = clazz.getDeclaredConstructors();
                System.out.println("Number of declared constructors for Ellipse: " + declaredConstructors.length);
                return;
            case "CheckConstructor3":
                clazz = Triangle.class;
                declaredConstructors = clazz.getDeclaredConstructors();
                System.out.println("Number of declared constructors for Triangle: " + declaredConstructors.length);
                return;
            default:
                System.out.println("Unknown operation");
                return;
        }

        assert shape != null;
        System.out.println("\n" + shape);
        System.out.print("Area is ");
        System.out.format("%.2f", shape.area());
        System.out.print("\nPerimeter is ");
        System.out.format("%.2f", shape.perimeter());
    }
}