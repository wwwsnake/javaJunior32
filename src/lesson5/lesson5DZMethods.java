package lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать методы:
 * 1) Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
 * 2) Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке
 * 3) Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
 * 4) В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам
 * 5) В метод передаем 3 числа, метод должен вернуть меньшее число из 3х
 * 6) В метод передаем сумму депозита, банковский процент и кол-во лет, и метод возвращает значение прироста процентов которые мы заберем с банка через столько лет
 * 7) В метод передаем email, метод должен вернуть true или false подходит нам email или нет. Подходит: когда содержит @, когда нет пробелов, когда часть текста после @ содержит в себе точку
 */
public class lesson5DZMethods {

    //1)
    public static int numberOfVowel(String text) {
        Matcher match = Pattern.compile("[аеёиоуыэюяaioeuy]").matcher(text);
        int count = 0;
        while (match.find()) {
            count++;
        }
        return count;
    }

    //2)
    public static void reverseText(String text) {
        char[] mass = text.toCharArray();
        for (int i = mass.length - 1; i > 0; i--) {
            System.out.print(mass[i]);
        }
    }

    //3)
    public static void numberOfChars(String text) {
        Matcher match = Pattern.compile("[.,?^! -]").matcher(text);
        int count = 0;
        while (match.find()) {
            count++;
        }
        System.out.println("3) знаков пунктуации: " + count);
    }

    //4)
    public static void printShapeOf1(int rows, int cols) {
        int[][] shape = new int[rows][cols];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }

    //5)
    public static int smallerNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (c < b && c < a) {
            return c;
        } else {
            return b;
        }
    }

    //6)
    public static double podschetNavara(double deposit, int years, int persents) {
        double monthPersent = persents / 12;
        double startSumm = deposit;
        for (int i = 0; i < years * 12; i++) {
            deposit = deposit + (deposit * monthPersent / 100);
        }
        return (deposit - startSumm);
    }

    //7)
    public static boolean checkEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

}

