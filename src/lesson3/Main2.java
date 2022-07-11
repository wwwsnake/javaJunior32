package lesson3;

public class Main2 {
    public static void main(String[] args) {
        /**
         * есть массив чисел. нужно вывести на консоль сумму только четных чисел
         */

        int[] numbers = {2,4,6,5,7,9,34,20,34,23};

        int summ = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2 ==0){
                summ+=numbers[i];
            }
        }
        System.out.println(summ);
    }
}
