public class Circle extends Ellipse {
    private double r;
    final double Pi = 3.14159;

    public Circle(double r, String color) {
        super(0,0,color);
        this.r = r;
    }
    
    
    @Override
    public double area(){
        return Pi * r * r;
    }
    
    @Override
    public double perimeter(){
        return 2 * (Pi * r);
    }
    
    @Override
    public String toString() {
        return super.toString() + " which is also a Circle";
    }
}