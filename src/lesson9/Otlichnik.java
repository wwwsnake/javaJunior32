package lesson9;

public class Otlichnik extends Student {

    @Override
    public void printPerimetrTreugolnika(int a, int b, int c) {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("это не треугольник");
        } else {
            System.out.println(a + b + c);
        }
    }
}
