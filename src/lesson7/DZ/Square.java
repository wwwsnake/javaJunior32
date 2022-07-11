package lesson7.DZ;

public class Square {
    private int a;

    public Square() {

    }

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int squareOfSquare(int a) {
        return a * a;
    }

    public int perimeterOfSquare(int a) {
        return a*4;
    }
}
