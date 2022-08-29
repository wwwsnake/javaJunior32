package lesson20;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {
        //если продукт уже есть, нужно добавить к текущему кол-ву
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        } else {
            products.put(product, value);
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет в холодильнике " + product);
            return;
        }
        if (products.get(product) < value) {
            System.out.println("Столько нет " + product);
            products.remove(product);//удалить из списка
            return;
        }
        if (products.get(product) == value) {
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - value);
    }

    //2 арианта вывода HashMap на консоль:
    public void printAllProducts1() {
        for (String p : products.keySet()) {
            System.out.println(p + " - " + products.get(p));
        }
    }

    public void printAllProducts2() { // в ходе этого способа можно что-то менять
        for (Map.Entry<String, Integer> p : products.entrySet()) {
            System.out.println(p.getKey() + " - " + p.getValue());
        }
    }

    public void canCook(Recipe recipe) {
        //метод определяет есть ли достаточное кол-во нужных продуктов
        //recipe - список ингредиентов и названий
        for (String ingr : recipe.getIngredients().keySet()) {
            if (!products.containsKey(ingr)) {
                System.out.println("нет " + ingr);
                return;
            }
            if (products.get(ingr) < recipe.getIngredients().get(ingr)) {
                System.out.println("не хватает " + ingr);
                return;
            }
        }
        System.out.println("Можно приготовить " + recipe.getName());
    }

}
