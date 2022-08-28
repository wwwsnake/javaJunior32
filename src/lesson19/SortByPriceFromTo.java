package lesson19;

import java.util.Comparator;

public class SortByPriceFromTo implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {
        //o1 - this

        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }
        if (o1.getPriceWithDiscount() != o2.getPriceWithDiscount()) {
            return (o2.getPriceWithDiscount() - o1.getPriceWithDiscount());
        }
        if (o1.getPopularity() != o2.getPopularity()) {
            return o2.getPopularity() - o1.getPopularity();
        }
        if (!o1.getName().equals(o2.getName())) { //если имена не совпадают
            return o2.getName().compareTo(o1.getName());//вернет число (- + или 0)
        } else {
            return 0;
        }
    }
}
