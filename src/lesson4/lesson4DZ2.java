package lesson4;

public class lesson4DZ2 {
    public static void main(String[] args) {
        int[][] numbers = new int[9][9];
        int from = (numbers.length - 1) / 2;
        int to = (numbers.length - 1) / 2;
        for (int i = 0; i < (numbers.length + 1) / 2; i++) {
            from--;
            to++;
            for (int j = 0; j < numbers[i].length; j++) {
                if (j > from && j < to) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }

            }
            System.out.println();
        }
        for (int i = (numbers.length + 2) / 2; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
