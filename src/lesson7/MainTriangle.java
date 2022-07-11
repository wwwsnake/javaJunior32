package lesson7;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(7);
        triangle.setB(5);
        triangle.setC(10);

        Triangle triangle2 = new Triangle(5,5,6);
        //в метод передается всегда 2 типа параметров (явные (7) и неявные (тот объект, у которого вызван данный метод(по слову this определяется))
    }
}
