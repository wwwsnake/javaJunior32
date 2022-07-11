package lesson10;


public class Dealer extends Player {


    public boolean needsCard() {
        if (currentPoints()<17){
            return true;
        }
            return false;
    }

}
