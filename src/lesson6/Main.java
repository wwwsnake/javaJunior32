package lesson6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * мы - турагенство.
         * программа отображает набор туров в зависимости от потребности клиента
         */
        String[][] tours = {{"1", "Италия", "10 дней", "самолет", "5 звезд", "120000", "полупансионат"},
                {"2", "Испания", "7 дней", "самолет", "5 звезд", "120000", "завтраки"},
                {"3", "Франция", "8 дней", "самолет", "3 звезд", "50000", "все включено"},
                {"4", "Германия, Швейцария", "10 дней", "автобус", "5 звезд", "70000", "полупансионат"},
                {"5", "Франция", "7 дней", "самолет", "5 звезд", "50000", "полупансионат"},
                {"6", "Армения", "10 дней", "самолет", "4 звезд", "100000", "полупансионат"},
                {"7", "Грузия", "21 дней", "самолет", "5 звезд", "67000", "полупансионат"},
                {"8", "Португалия", "10 дней", "самолет", "5 звезд", "210000", "полупансионат"},
                {"9", "Египет", "10 дней", "самолет", "3 звезд", "58000", "полупансионат"},
                {"10", "Италия", "7 дней", "самолет", "4 звезд", "75000", "полупансионат"}};

        System.out.println("Добрый день! Выберите действие: ");
        System.out.println("1-средняя цена тура по определенной стране");
        System.out.println("2-узнать среднюю стоимость тура");
        System.out.println("3-вывести туры в определенную страну");
        System.out.println("4-вывести туры в диапазоне цен");
        System.out.println("5-вывести туры +/- 2 дня от введенных дней в определенную страну");
        System.out.println("6-вывести выгодные туры (цена в день меньше 10к)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость в " + country + "= " + averagePrice);
        } else if (answer.equals("2")) {
            System.out.println("Средняя стоимость тура: " + TourUtils.getAveragePriceOfTour(tours));
        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ": ");
            TourUtils.printToursByCountry(tours, country);
        } else if (answer.equals("4")) {
            TourUtils.toursByPriceDiapazon(tours, ScannerUtils.getMinPrice(), ScannerUtils.getMaxPrice());
        } else if (answer.equals("5")) {
            String country = ScannerUtils.getInputCountry();
            int days = ScannerUtils.getDays();
            TourUtils.toursByDaysAndCountry(tours, country, days);
        } else if (answer.equals("6")) {
            TourUtils.hotTours(tours);
        }
    }
}