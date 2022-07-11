package lesson7.Tours;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1,5, "самолет",5,120000,"полупансионат");
        Tour tour2 = new Tour(2,7, "самолет",3,80000,"полупансионат");
        Tour tour3 = new Tour(3,5, "автобус",4,90000,"полупансионат");

        tour1.addCountry("Италия");
        tour2.addCountry("Франция");
        tour3.addCountry("Грузия");
        tour3.addCountry("Армения");

    }
}
