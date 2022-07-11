package lesson10;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda implements IKoloda {

    ArrayList<Card> cards = new ArrayList<>();

    public Koloda() {

        this.prepareCards();
    }

    public void prepareCards() {
        cards.add(new Card("2, Трефа", 2));
        cards.add(new Card("2, Черви", 2));
        cards.add(new Card("2, Пика", 2));
        cards.add(new Card("2, Бубна", 2));

        cards.add(new Card("3, Трефа", 3));
        cards.add(new Card("3, Черви", 3));
        cards.add(new Card("3, Пика", 3));
        cards.add(new Card("3, Бубна", 3));

        cards.add(new Card("4, Трефа", 4));
        cards.add(new Card("4, Черви", 4));
        cards.add(new Card("4, Пика", 4));
        cards.add(new Card("4, Бубна", 4));

        cards.add(new Card("5, Трефа", 5));
        cards.add(new Card("5, Черви", 5));
        cards.add(new Card("5, Пика", 5));
        cards.add(new Card("5, Бубна", 5));

        cards.add(new Card("6, Трефа", 6));
        cards.add(new Card("6, Черви", 6));
        cards.add(new Card("6, Пика", 6));
        cards.add(new Card("6, Бубна", 6));

        cards.add(new Card("7, Трефа", 7));
        cards.add(new Card("7, Черви", 7));
        cards.add(new Card("7, Пика", 7));
        cards.add(new Card("7, Бубна", 7));

        cards.add(new Card("8, Трефа", 8));
        cards.add(new Card("8, Черви", 8));
        cards.add(new Card("8, Пика", 8));
        cards.add(new Card("8, Бубна", 8));

        cards.add(new Card("9, Трефа", 9));
        cards.add(new Card("9, Черви", 9));
        cards.add(new Card("9, Пика", 9));
        cards.add(new Card("9, Бубна", 9));

        cards.add(new Card("10, Трефа", 10));
        cards.add(new Card("10, Черви", 10));
        cards.add(new Card("10, Пика", 10));
        cards.add(new Card("10, Бубна", 10));

        cards.add(new Card("J, Трефа", 2));
        cards.add(new Card("J, Черви", 2));
        cards.add(new Card("J, Пика", 2));
        cards.add(new Card("J, Бубна", 2));

        cards.add(new Card("Q, Трефа", 3));
        cards.add(new Card("Q, Черви", 3));
        cards.add(new Card("Q, Пика", 3));
        cards.add(new Card("Q, Бубна", 3));

        cards.add(new Card("K, Трефа", 4));
        cards.add(new Card("K, Черви", 4));
        cards.add(new Card("K, Пика", 4));
        cards.add(new Card("K, Бубна", 4));


        cards.add(new Card("A, Трефа", 11));
        cards.add(new Card("A, Черви", 11));
        cards.add(new Card("A, Пика", 11));
        cards.add(new Card("A, Бубна", 11));
    }

    @Override
    public Card getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, cards.size());
        return cards.get(randomIndex);
    }


}
