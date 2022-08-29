package lesson20;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpl<String, String> phoneBook = new MultiMapImpl<>(); //создаем телефонную книгу
        phoneBook.put("Слава", "89124212311");
        phoneBook.put("Слава", "81548128585");
        phoneBook.put("Слава", "81391694269");
        phoneBook.put("Петя", "82646549944");
    }
}
