package lesson2;
//сколько мы заберем денег с банка если положем 100к на 5 лет под 8%

public class Main7 {
    public static void main(String[] args) {

        double money = 100000;
        int years = 5;
        int percent = 8;

        for (int month = 0; month < 12*years; month++){
            money = money + ((money/100*percent)/12);

        }
        System.out.println(money);
    }
}
