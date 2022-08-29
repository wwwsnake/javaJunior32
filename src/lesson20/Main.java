package lesson20;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("apple", 2);
        fridge.putProduct("cherry", 5);
        fridge.putProduct("melon", 1);
        fridge.putProduct("peach", 8);
        fridge.putProduct("orange", 7);
        fridge.putProduct("apple", 1);

        fridge.getProduct("apple" , 1);
        fridge.printAllProducts2();

        Recipe recipe = new Recipe("Фруктовый салат");
        recipe.addIngredient("apple",1);
        recipe.addIngredient("peach",3);
        recipe.addIngredient("orange",2);
        recipe.addIngredient("tomato",2);

        fridge.canCook(recipe);
    }
}
