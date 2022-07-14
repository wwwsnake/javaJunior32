package lesson13;

public class Coin {
    private  int nominal;
    private int year;
    private double diameter;
    private String metal;

    public Coin(int nominal, int year, double diameter, String metal) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metal = metal;
    }

    public Coin() {
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Монета{" +
                "номинал =" + nominal +
                ", год выпуска =" + year +
                ", диаметр =" + diameter +
                ", металл ='" + metal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        return metal != null ? metal.equals(coin.metal) : coin.metal == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        return result;
    }
}
