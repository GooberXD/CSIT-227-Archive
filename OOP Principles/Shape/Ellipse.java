public class Ellipse extends Shape {
    private double a;
    private double b;
    final double Pi = 3.14159;

    public Ellipse(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }
    
    
    @Override
    public double area(){
        return Pi * a * b;
    }
    
    @Override
    public double perimeter(){
        double mass = Math.sqrt( (a + (3 * b)) * (b + (3 * a) ));
        return Pi * (3 * (a + b) - mass);
    }
    
    @Override
    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }
    
}