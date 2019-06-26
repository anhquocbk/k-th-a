package Bai4;

public class TriAngle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public TriAngle() {

    }
    public TriAngle( double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public TriAngle( String color, boolean filled, double side1, double side2, double side3 ) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public double getArea() {
        return Math.sqrt((getPerimeter()*(getPerimeter()/2 - side1)*(getPerimeter()/2 - side3)*(getPerimeter()/2 - side2))/2);
    }
    public String toString() {
        return super.toString() + "Triangle: " + ", Area: " + getArea() + " , Perimeter: " + getPerimeter();
    }
}
