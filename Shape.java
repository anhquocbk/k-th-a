package Bai4;

public class Shape {
    private String color = "green";
    private boolean filled = false;

    public Shape() {
    }
    public Shape(String color, boolean fiilled) {
        this.color = color;
        this.filled = fiilled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A shape with color of "
                + getColor()
                + " and"
                + (isFilled() ? " filled" : " not filled");
    }
}
