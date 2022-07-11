package lesson3;
//создание и заполнение массива
public class Main1 {
    public static void main(String[] args) {
        /**
         * создать массив 10 ячеек и наполнить четными числами 30+
         */
        int[] numbers = new int[10];


        int even = 30;
        for (int i=0; i<numbers.length; i++){
            numbers[i] = even;
            even +=2;
            System.out.println(numbers[i]);
        }
    }
}
