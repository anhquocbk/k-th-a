package Bai4;

public class testMovablePoint {
    public static void main(String[] args) {
        moveablePoint move1 = new moveablePoint(1 ,1,5, 5);
        System.out.println(move1);
        System.out.println("new point: " + "\n" + move1.move());
    }
}
