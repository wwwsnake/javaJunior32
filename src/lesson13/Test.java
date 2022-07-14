package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis(); //кол-во секунд с 1.01.1970
        for (int i = 0; i < 100000; i++) {
            arrayList.add("ada" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения arrayList.add " + (endTime-startTime));

        long startTime2 = System.currentTimeMillis(); //кол-во секунд с 1.01.1970
        for (int i = 0; i < 100000; i++) {
            linkedList.add("ada" + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения linkedList.add " + (endTime2-startTime2));

        long startTime4 = System.currentTimeMillis(); //кол-во секунд с 1.01.1970
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время выполнения arrayList.get " + (endTime4-startTime4));

        long startTime3 = System.currentTimeMillis(); //кол-во секунд с 1.01.1970
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения linkedList.get " + (endTime3-startTime3));
    }
}
