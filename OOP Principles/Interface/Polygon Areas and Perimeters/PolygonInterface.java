// In geometry, a polygon is a plane figure with at least three straight sides and angles. 
// Each polygon has an area and a perimeter, but they all have different formulas.

// You are tasked to implement different kinds of Polygons and to make sure that we 
// can get the areas and perimeters of all the Polygons. For this program, 
// you are tasked to define the following:

// Interface - PolygonInterface:

// Methods:
// public double getArea(): Method to calculate the area of the polygon.
// public double getPerimeter(): Method to calculate the perimeter of the polygon.
 

// Class - Square (implements PolygonInterface):

// Private Property:
// private double side: The length of a side of the square.
// Constructor:
// public Square(double side): Initializes the side property.
// Implemented Methods:
// public double getArea(): Returns the area of the square, calculated as side * side.
// public double getPerimeter(): Returns the perimeter of the square, calculated as 4 * side.
 

// Class - Rectangle (implements PolygonInterface):

// Private Properties:
// private double length
// private double width
// Constructor:
// public Rectangle(double length, double width): Initializes length and width.
// Implemented Methods:
// public double getArea(): Returns the area of the rectangle, calculated as length * width.
// public double getPerimeter(): Returns the perimeter of the rectangle, 
// calculated as 2 * (length + width).
 

// Class - Trapezoid (implements PolygonInterface):

// Private Properties:
// private double a
// private double b
// private double c
// private double d
// private double height
// Constructor:
// public Trapezoid(double a, double b, double c, double d, double height): 
// Initializes the side lengths a, b, c, d, and height.
// Implemented Methods:
// public double getArea(): Returns the area of the trapezoid, calculated as 
// ((a + b) / 2) * height.
// public double getPerimeter(): Returns the perimeter of the trapezoid, 
// calculated as a + b + c + d.

public interface PolygonInterface{
    
    public double getArea();
    public double getPerimeter();
    
    
}