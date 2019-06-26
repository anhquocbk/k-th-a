package Bai4;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }
    public double getArea() {
        return radius*Math.PI*radius;
    }
    public String toString() {
        return "Radius: "
                + getRadius()
                + " color: "
                + getColor();
    }
}
