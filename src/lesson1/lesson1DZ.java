package lesson1;

import org.w3c.dom.ls.LSOutput;

/**
 * Даны переменные:
 * - деньги которые у нас есть - 1000 рублей
 * - стоимость пиццы - 230 рублей
 * - стоимость жвачки - 26 рублей
 * - стоимость конфеты - 2,5 рубля
 * Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пицц, затем на сдачу купить максимум жвачек,
 * затем на оставшуюся сдачу купить конфет.
 * В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
 * На эти деньги мы можем купить:
 * - 4 пиццы
 * - 3 жвачки
 * - 0 конфет
 * Сдача с магазина: 2 рубля.
 */

public class lesson1DZ {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrice = 230;
        int bubbleGumPrice = 26;
        double candyPrice = 2.5;

        int rest1 = money % pizzaPrice; //сдача с пиццы
        int pizza = money / pizzaPrice; //количество пицц
        int rest2 = rest1 % bubbleGumPrice; //сдача с жвачек
        int bubbleGum = rest1 / bubbleGumPrice; //количество жвачек
        double rest3 = rest2 % candyPrice; // сдача с конфет
        int candy = (int) (rest2 / candyPrice); // количество конфет

        System.out.println("На " + money + "р. мы можем купить:" + "\n" + pizza + " пиццы" + "\n" + bubbleGum + " жвачек" + "\n" + candy + " конфет" + "\n" + "сдача: " + rest3 + "р.");
    }
}
