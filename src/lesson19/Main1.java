package lesson19;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
       Tovar tovar1 = new Tovar("мышка",1200,900,231);
       Tovar tovar2 = new Tovar("мышка",1200,900,231);
       Tovar tovar3 = new Tovar("ноут",120000,784,92310);
       Tovar tovar4 = new Tovar("монитор",12000,2345,9000);
       Tovar tovar5 = new Tovar("микрофон",700,1556,631);
        //чтобы не добавлялось 2 одинаковых товара в коллекцию - переопределить методы equals и hashCode
        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar t: tovars) {
          //  System.out.println(t.toString());
        }
       // TypesOfSort.printTovarsByPriceFromTo(tovars);
        //TypesOfSort.printTovarsByPopularityFromTo(tovars);
        TypesOfSort.printTovarsByDiscountInPercent(tovars);

    }
}
