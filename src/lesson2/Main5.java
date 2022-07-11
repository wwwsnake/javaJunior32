package lesson2;

//вывести на экран только четные от 30 до 50

public class Main5 {
    public static void main(String[] args) {

        for (int i=30; i<=50; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
