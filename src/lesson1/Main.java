package lesson1;

public class Main {
    public static void main(String[] args) {

        /**
         * Есть число. нужно понять четное или нет
         */

        int number = 132;
        //всегда останется 0 или 1
        int ostatok = number % 2;
        boolean x = ostatok == 0;
        System.out.println(x);

    }
}
