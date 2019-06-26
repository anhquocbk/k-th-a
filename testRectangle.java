package Bai4;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4, 6.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", true, 4, 6.8);
        System.out.println(rectangle);
        System.out.println("Area " + rectangle.getArea() + " and Perimeter " + rectangle.getPerimeter());
    }
}
