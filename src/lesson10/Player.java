package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {


    private  String name;
    public   ArrayList<Card> cardsInHand = new ArrayList<>();

    public String getName() {

        return name;
    }

    @Override
    public void addCardToHand(Card card) {

        cardsInHand.add(card);
    }

    @Override
    public boolean needsCard() {
        this.openHand();
        System.out.println("Нужна еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void openHand() {
        System.out.println("--- Ваши карты, " + this.name + ":");
        for (Card c : cardsInHand) {
            System.out.println(c.getName());
        }
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    public int currentPoints() {
        int points = 0;
        for (Card c : cardsInHand) {
            points = points + c.getValue();
        }
        return points;
    }
}
