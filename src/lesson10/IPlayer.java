package lesson10;

public interface IPlayer {

    public abstract void addCardToHand(Card card);

    boolean needsCard();

    void openHand();

    void setName(String name);
}


