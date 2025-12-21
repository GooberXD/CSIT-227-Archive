public class EquilateralTriangle extends Triangle {
    private double side;
    final double Pi = 3.14159;

    public EquilateralTriangle(double side, String color) {
        super(0,0,0,0,color);
        this.side = side;
    }

    @Override
    public double area(){
        return Math.sqrt(3) / 4 * side * side;
    }

    @Override
    public double perimeter(){
        return 3 * side;
    }

    @Override
    public String toString() {
        return super.toString() + " which is also an Equilateral Triangle";
    }
}
