package lesson7.DZ;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("При радиусе круга " + circle.getRadius() + " его площадь равна " + circle.squareOfCircle(circle.getRadius()) +
                ", а периметр " + circle.perimeterOfCircle(circle.getRadius()));
        Square square = new Square(5);
        System.out.println("При стороне квадрата " + square.getA() + " его площадь равна " + square.squareOfSquare(square.getA()) +
                ", а периметр " + square.perimeterOfSquare(square.getA()));

        Rectangle rectangle = new Rectangle(8, 6);
        System.out.println("При размерах прямоугольника " + rectangle.getLength() + " на " + rectangle.getWidth() + " его площадь равна "
                + rectangle.squareOfRectangle(rectangle.getLength(), rectangle.getWidth()) + ", а периметр " + rectangle.perimeterOfRectangle(rectangle.getLength(), rectangle.getWidth()));
    }

}
