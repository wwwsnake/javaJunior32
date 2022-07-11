package lesson2;

/**
 * есть 3 стороны треугольника.
 * определить какой именно треугольник (равносторонний, равнобедренный или разносторонний)
 */


public class Main {
    public static void main(String[] args) {

       int a = 12;
       int b = 12;
       int c = 15;

       if(a != b && b != c && a != c){
           System.out.println("треугольник разносторонний");
       }
       else if(a == b && b == c && a == c){
           System.out.println("треугольник равносторонний");
       }
       else{
           System.out.println("треугольник равнобедренный ");
       }


    }
}
