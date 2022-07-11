package lesson7.DZ;

public class Circle {
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double squareOfCircle(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double perimeterOfCircle(int radius) {
        return 2 * Math.PI * radius;
    }

}
