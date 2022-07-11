package lesson10;

public class Main {
    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();
        Dealer dealer = new Dealer();
        Player player1 = new Player();
        player1.setName("Вася");
        Player player2 = new Player();
        player2.setName("Петя");

        blackJack.addPlayerToGame(dealer);
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);

        blackJack.dealTwoCardsToAllPlayers();
        blackJack.dealRestCardsToAllPlayer();
        blackJack.printWinner();


    }
}
