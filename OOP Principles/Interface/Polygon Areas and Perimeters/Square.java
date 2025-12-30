public class Square implements PolygonInterface{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double getSide(){
        return side;
    }
    
    
    
    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return side * 4;
    }
    
    
}