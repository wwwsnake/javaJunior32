package lesson2;

/**
 * С помощью цикла For, напечатать на консоль:
 * 1) Только четные от -100 до -50
 * 2) Все числа в обратном порядке от 10 до 30
 * 3) Кол-во четных чисел в диапазоне от 30 до 61
 * 4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
 * 5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
 */

public class lesson2DZ {
    public static void main(String[] args) {

        System.out.println("Ответ 1:");
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Ответ 2:");
        for (int i = 30; i >= 10; i--) {
            System.out.println(i);
        }

        System.out.println("Ответ 3:");
        int count = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("Ответ 4:");
        int months = 0;
        for (double i = 0; i <= 200000; i += 9500) {
            months++;
        }
        double years = (double) months / 12;
        System.out.println(years + " лет или " + months + " месяцев");

        System.out.println("Ответ 5:");
        for (int i = 20; i <= 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }
    }
}