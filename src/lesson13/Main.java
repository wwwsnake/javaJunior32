package lesson13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> texts = new LinkedList<>();
        texts.add("qww");
        texts.add("ertua");
        texts.add("yt");
        texts.add("jyurfdg");
        texts.add(2,"w34y"); //индекс указывать только уже существующий
        System.out.println(texts);
     }
}
