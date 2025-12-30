public class Trapezoid implements PolygonInterface{
    private double a;
    private double b;
    private double c;
    private double d;
    private double height;

    public Trapezoid(double a, double b, double c, double d, double height){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }
    

    
    
    
    public double getArea(){
        return ((a + b) / 2) * height ;
    }
    
    public double getPerimeter(){
        return a + b + c + d;
    }
    
    
}