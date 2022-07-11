package lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 3, 356, 7, 7, 2, 34, 354, 6, 6};

        for (int i = 0; i < numbers.length; i++) {
            String currentNumFromMassive = Integer.toString(numbers[i]);
         int startIndex4  =  currentNumFromMassive.indexOf('4');
         if (startIndex4!=-1){
             System.out.println(currentNumFromMassive);
         }
        }
    }
}