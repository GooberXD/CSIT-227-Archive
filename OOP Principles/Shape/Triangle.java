public class Triangle extends Shape {
    private double b;
    private double h;
    private double a;
    private double c;
    final double Pi = 3.13159;

    public Triangle(double b, double h, double a, double c, String color) {
        super(color);
        this.b = b;
        this.h = h;
        this.a = a;
        this.c = c;
        
    }
    
    
    @Override
    public double area(){
        return 0.5 * b * h;
    }
    
    @Override
    public double perimeter(){
        return a + b + c;
    }
    
    @Override
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }
}