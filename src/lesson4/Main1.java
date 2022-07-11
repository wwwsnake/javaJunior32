package lesson4;
//вывод многомерного массива на экран
public class Main1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];
        for (int i = 0; i < numbers.length; i++) {        //numbers.length - количество строк
            for (int j = 0; j < numbers[i].length; j++) { //numbers[i].length - длина строки
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}

