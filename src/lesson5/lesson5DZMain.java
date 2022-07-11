package lesson5;

import java.util.Scanner;

public class lesson5DZMain {
    public static void main(String[] args) {
        //1)
        System.out.println("введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int x = lesson5DZMethods.numberOfVowel(text);
        System.out.println("1) гласных: " + x);

        //2)
        System.out.print("2) в обратном порядке: ");
        lesson5DZMethods.reverseText(text);
        System.out.println();

        //3)
        lesson5DZMethods.numberOfChars(text);

        //4)
        System.out.print("4) ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("количество строк: ");
        int rows = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("количество колонок: ");
        int cols = scanner2.nextInt();
        lesson5DZMethods.printShapeOf1(rows, cols);

        //5)
        System.out.print("5) введите 3 числа: " + "\n");
        Scanner scanner3 = new Scanner(System.in);
        int a = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        int b = scanner4.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        int c = scanner5.nextInt();
        System.out.println("меньшее число: " + lesson5DZMethods.smallerNumber(a, b, c));

        //6)
        System.out.print("6) ");
        System.out.println("введите сумму депозита, кол-во лет и процентов ");
        System.out.println("чистая прибыль составляет: " + lesson5DZMethods.podschetNavara(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

        //7)
        System.out.println("7) ");
        System.out.println("введите email: ");
        Scanner readMail = new Scanner(System.in);
        String mail = readMail.nextLine();
        if (lesson5DZMethods.checkEmail(mail) == true) {
            System.out.println("все ок");
        } else {
            System.out.println("ввели с ошибкой");
        }
    }
}
