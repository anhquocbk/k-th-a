package Bai4;

public class testTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        System.out.println(triAngle);

        triAngle = new TriAngle("red", true, 6,8,10);
        System.out.println(triAngle);
    }
}
