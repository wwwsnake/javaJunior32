package lesson3;

public class Main3 {
    public static void main(String[] args) {
        /**
         * есть массив символов. вывести на консоль весь массив в обратном порядке
         */

        char[] symbols = {'&','2','*','^',')'};
        for (int i = symbols.length-1; i>=0; i--){
            System.out.println(symbols[i]);
        }
    }
}
