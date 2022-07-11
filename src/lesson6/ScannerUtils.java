package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    //метод будет возвращать страну
    public static String getInputCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну: ");
        String country = scanner.nextLine();
        return country;
    }

    public static int getDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во дней: ");
        int days = scanner.nextInt();
        return days;
    }

    public static int getMinPrice() {
        System.out.println("Введите центу ОТ: ");
        Scanner scanner1 = new Scanner(System.in);
        int minPrice = scanner1.nextInt();
        return minPrice;
    }

    public static int getMaxPrice() {
        System.out.println("Введите цену ДО: ");
        Scanner scanner2 = new Scanner(System.in);
        int maxPrice = scanner2.nextInt();
        return maxPrice;
    }
}
