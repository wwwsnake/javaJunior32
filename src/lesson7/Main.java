package lesson7;

public class Main {
    public static void main(String[] args) {
        Tovar table1 = new Tovar();
        Tovar table2 = new Tovar();

       // table1.id = 12312412; //т.к. данные скрыты, мы должны написать методы в классе Tovar
        table1.setId(12312412);
      //  table1.fullPrice = 12000;
        table1.setFullPrice(12000);
    }
}
