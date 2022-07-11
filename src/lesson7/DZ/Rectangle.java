package lesson7.DZ;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int squareOfRectangle(int length, int width) {
        return length * width;
    }

    public int perimeterOfRectangle(int length, int width) {
        return (length + width)*2;
    }
}
