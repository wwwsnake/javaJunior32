package lesson2;
//напечатать от 30 до 100 числа кратные и 3, и 5

public class Main6 {
    public static void main(String[] args) {

        for (int i=30; i<=100; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
