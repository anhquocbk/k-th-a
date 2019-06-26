package Bai4;

public class Cylinder extends Circle{
    private double height = 5;

    public Cylinder() {
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return 2*super.getArea() + height*2*Math.PI*super.getRadius();
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    public String toString() {
        return super.toString()
                + " height: "
                + this.height
                + " Area: "
                + getArea()
                + " Volume: "
                + getVolume();
    }

}
