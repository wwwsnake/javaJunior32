package lesson10;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addPlayerToGame(Player player) {
        if (players.size() < 9) {
            players.add(player);
        } else {
            System.out.println("Нет свободных мест!");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealRestCardsToAllPlayer() {
        for (Player p : players) {
            while (p.needsCard()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        ArrayList<Player> winners = new ArrayList<>();
        int dealerPoints = 0;

        for (Player p : players) {
            if (p.currentPoints() <= 21 && p instanceof Dealer) { //p instanceof Dealer - является объектом класса Dealer
                winners.add(p);
            } else if (p instanceof Dealer) {
                dealerPoints += p.currentPoints();
                if (dealerPoints > 21) {
                    System.out.println("У крупье перебор (" + dealerPoints + " очков)");
                }
            } else {
                System.out.println(p.getName() + " проиграл с " + p.currentPoints() + " очков");
            }
        }
        int winScore = 0;
        for (Player w : winners) {
            if (w.currentPoints() > winScore) {
                winScore = w.currentPoints();
            }
        }
        for (Player w : winners) {
            if (dealerPoints <= 21 && dealerPoints > winScore) {
                System.out.println("Победил крупье с " + dealerPoints + " очков!");
            } else if (dealerPoints <= 21 && dealerPoints < winScore) {
                System.out.println("Победил " + w.getName() + " с " + w.currentPoints() + " очков");

            } else if (dealerPoints > 21) {
                System.out.println("Победил " + w.getName() + " с " + w.currentPoints() + " очков");
            } else if (dealerPoints == winScore) {
                System.out.println("Победителей нет!");
            }
        }

    }
}



