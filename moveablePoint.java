package Bai4;

public class moveablePoint extends Point2D {
    private float speedX = 0;
    private float speedy = 0;

    public moveablePoint(){

    }
    public moveablePoint(float speedX, float speedy) {
        this.speedX = speedX;
        this.speedy = speedy;
    }
    public moveablePoint(float speedX, float speedy, float x, float y) {
        super(x,y);
        this.speedy = speedy;
        this.speedX = speedX;
    }
    public float getSpeedX() {
        return speedX;
    }
    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }
    public float getSpeedy() {
        return speedy;
    }
    public void setSpeedY(float speedY) {
        this.speedy = speedY;
    }
    public void setSpeed(float speedX, float speedy ) {
        this.speedX = speedX;
        this.speedy = speedy;
    }
    public moveablePoint move() {
        x += this.speedX;
        y += this.speedy;
        return this;
    }
    public String toString() {
        return super.toString();
    }

}
