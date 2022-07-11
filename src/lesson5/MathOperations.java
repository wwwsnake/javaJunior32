package lesson5;

public class MathOperations {
    /**
     * создать метод в который мы передаем 3 стороны треугольника, а он выводит на консоль какой вид треугольника
     */

    /**
     * объявление метода:
     * 1-модификатор доступа:
     * public
     * protected - внутри текущего файла и его наследникам
     * private - внутри текущего файла
     * ничего не указать - доступ только внутри текущей папки и наследникам данного файла
     * 2 - static (либо пишем, либо нет в зависимости от того, обращаемся к объекту класса или нет и от этого зависит способ вызова данного метода)
     * 3 - возвращаемый тип: void, int, String, date, time...
     * 4- название
     * 5 - в скобках входящие параметры
     * 6 - тело метода
     */

    public static void printTypeOfTriangle(int a, int b, int c) {
        if ((a + b) <= c || (a + c) <= b || (b + c) < -a) {
            System.out.println("такого не существует");
            return;
        }
        if (a == b && b == c && c == a) {
            System.out.println("равносторонний треугольник");
        } else if (a != b && b != c && c != a){
            System.out.println("разносторонний треугольник");
        } else  {
            System.out.println("равнобедренный треугольник");
        }
    }

    /**
     * метод, в который мы предаем 3 стороны и возвращаем площадь
     */
    public static double calculateSquare (int a, int b, int c){
        double p = 0.5*(a+b+c);
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public static double calculateSquare (int osnovanie, int visota){
        double s = 0.5*osnovanie*visota;
        return s;
    }

}
