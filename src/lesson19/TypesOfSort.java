package lesson19;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TypesOfSort {

    public static void printTovarsByPriceFromTo(SortedSet<Tovar> tovars) {
        TreeSet<Tovar> sorted = new TreeSet<>(new SortByPriceFromTo());
        sorted.addAll(tovars);
        System.out.println("Товары по убыванию цены:");
        for (Tovar t : sorted) {
            System.out.println(t);
        }
    }

    public static void printTovarsByPopularityFromTo(SortedSet<Tovar> tovars) {
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() { //вместо создания отдельного класса
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.getPopularity() != o2.getPopularity()) {
                    return o2.getPopularity() - o1.getPopularity();
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.getPriceWithDiscount() != o2.getPriceWithDiscount()) {
                    return (o2.getPriceWithDiscount() - o1.getPriceWithDiscount());
                }
                if (!o1.getName().equals(o2.getName())) { //если имена не совпадают
                    return o2.getName().compareTo(o1.getName());//вернет число (- + или 0)
                } else {
                    return 0;
                }
            }
        });
        sorted.addAll(tovars);
        System.out.println("Товары по убыванию популярности:");
        for (Tovar t : sorted) {
            System.out.println(t);
        }
    }

    public static void printTovarsByDiscountInPercent(SortedSet<Tovar> tovars) {
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() { //вместо создания отдельного класса
            @Override
            public int compare(Tovar o1, Tovar o2) {
                int discount1 = o1.getPrice() - o1.getPriceWithDiscount();
                int discount2 = o2.getPrice() - o2.getPriceWithDiscount();
                int discountInPercent1 = discount1 * 100 / o1.getPrice();
                int discountInPercent2 = discount2 * 100 / o2.getPrice();

                if (discountInPercent1 > discountInPercent2) {
                    return -1;
                }
                if (discountInPercent1 < discountInPercent2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        sorted.addAll(tovars);
        System.out.println("Сначала товары с наибольшей скидкой:");
        for (Tovar t : sorted) {
            System.out.println(t);
        }
    }
}
