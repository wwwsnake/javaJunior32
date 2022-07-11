package lesson6;

public class TourUtils {
    public static int getAveragePriceByCountry(String[][] tours, String countryBy) {
        int allPricesByCountry = 0;
        int countTours = 0;

        for (int i = 0; i < tours.length; i++) {
            String countriesFromCurrentTour = tours[i][1];
            //убрать запятые между словами
            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", "");
            //разбили на массив стран
            String[] countries = countriesFromCurrentTour.split(" ");
            //проверили наличие страны в туре
            if (TourUtils.findCountry(countries, countryBy)) {
                countTours++;
                //переводится цена в инт и прибавляется к переменной
                allPricesByCountry = allPricesByCountry + Integer.parseInt(tours[i][5]);

            }
        }
        return allPricesByCountry / countTours;
    }

    private static boolean findCountry(String[] countries, String countryBy) {
        for (String c : countries) {
            if (countryBy.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            String countriesFromCurrentTour = tours[i][1];
            //убрать запятые между словами
            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", "");
            //разбили на массив стран
            String[] countries = countriesFromCurrentTour.split(" ");
            if (TourUtils.findCountry(countries, country)) {
                TourUtils.printTour(tours, i);
            }
        }
    }

    private static void printTour(String[][] tours, int i) {
        System.out.printf("Тур: %s, за %s руб, %s, на %s, %s, %s \n", tours[i][1], tours[i][5], tours[i][4], tours[i][2],
                tours[i][6], tours[i][3]);//само подставляет сюда значения переменных(%s - текст)

    }

    public static int getAveragePriceOfTour(String[][] tours) {
        int summOfPrices = 0;
        for (int i = 0; i < tours.length; i++) {
            summOfPrices = summOfPrices + Integer.parseInt(tours[i][5]);

        }
        return summOfPrices / tours.length;
    }

    public static void toursByPriceDiapazon(String[][] tours, int minPrice, int maxPrice) {
        for (int i = 0; i < tours.length; i++) {
            if (Integer.parseInt(tours[i][5]) >= minPrice && Integer.parseInt(tours[i][5]) <= maxPrice) {
                TourUtils.printTour(tours, i);
            }
        }
    }

    public static void toursByDaysAndCountry(String[][] tours, String country, int days) {
        for (int i = 0; i < tours.length; i++) {
            String countriesFromCurrentTour = tours[i][1];
            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", "");
            String[] countries1 = countriesFromCurrentTour.split(" ");
            if (TourUtils.findCountry(countries1, country)) {
                int indexOfSpace = tours[i][2].indexOf(" ");
                int daysToInt = Integer.parseInt(tours[i][2].substring(0, indexOfSpace));
                if (daysToInt > (days - 3) && daysToInt < (days + 3)) {
                    TourUtils.printTour(tours, i);
                }
            }
        }
    }


    public static void hotTours(String[][] tours) {
        System.out.println("Выгодные туры: ");
        for (int i = 0; i < tours.length; i++) {
            int indexOfSpace = tours[i][2].indexOf(" ");
            int daysToInt = Integer.parseInt(tours[i][2].substring(0, indexOfSpace));
            if (Integer.parseInt(tours[i][5]) / daysToInt <= 10000) {
                TourUtils.printTour(tours, i);
            }
        }
    }
}

