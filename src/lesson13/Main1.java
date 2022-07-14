package lesson13;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");

        for (Iterator<String> iterator = hashSet.iterator(); iterator.hasNext(); ) { //цикл по коллекции
            System.out.println(iterator.next());
        }
    }
}
