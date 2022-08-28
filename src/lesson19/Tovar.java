package lesson19;

public class Tovar implements Comparable<Tovar> { //в<>указываем с чем сравнивать будем
    private String name;
    private int price;
    private int popularity; //популярность
    private int priceWithDiscount; //цена со скидкой

    public Tovar() {
    }

    public Tovar(String name, int price, int popularity, int priceWithDiscount) {
        this.name = name;
        this.price = price;
        this.popularity = popularity;
        this.priceWithDiscount = priceWithDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public int getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(int priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", popularity=" + popularity +
                ", priceWithDiscount=" + priceWithDiscount +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        //this - первый товар
        //o - второй товар
        // по умолчанию - сортируем по цене по возрастанию
        if (this.getPrice() != o.getPrice()) {
            return this.getPrice() - o.getPrice();
        }
        if (this.getPriceWithDiscount() != o.getPriceWithDiscount()) {
            return (this.getPriceWithDiscount() - o.getPriceWithDiscount());
        }
        if (this.getPopularity() != o.getPopularity()) {
            return this.getPopularity() - o.getPopularity();
        }
        if (!this.getName().equals(o.getName())) { //если имена не совпадают
            return this.getName().compareTo(o.getName());//вернет число (- + или 0)
        } else {
            return 0;
        }
    }
}
