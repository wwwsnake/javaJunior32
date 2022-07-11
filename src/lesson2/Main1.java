package lesson2;

/**
 * есть число. нужно вывести на экран четное оно или нет
 */

public class Main1 {
    public static void main(String[] args) {

        int number = 12;

        if (number%2 == 0){
            System.out.println("четное");
        }
        else {
            System.out.println("нечетное");
        }
    }
}
