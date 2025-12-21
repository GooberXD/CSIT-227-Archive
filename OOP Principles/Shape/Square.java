public class Square extends Rectangle {
    private double side;

    public Square(double side, String color) {
        super(0,0,color);
        this.side = side;
       
    }
    
    
    @Override
    public double area(){
        return side * side;
    }
    
    @Override
    public double perimeter(){
        return 4 * side;
    }
    
    @Override
    public String toString() {
        return super.toString() + " which is also a Square";
    }
    
    
}