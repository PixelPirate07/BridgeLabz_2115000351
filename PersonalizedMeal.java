import java.util.*;
interface MealPlan {
    void getMeals();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void getMeals() {
        System.out.println("Vegetarian Meal: Grilled vegetables, tofu stir-fry, quinoa salad");
    }
}
class VeganMeal implements MealPlan{
    @Override
    public void getMeals(){
        System.out.println("Vegan Meal: Chickpea curry, lentil soup, avocado toast");
    }
}
class KetoMeal implements MealPlan{
    @Override
    public void getMeals(){
        System.out.println("Keto Meal: Grilled chicken, avocado salad, scrambled eggs");
    }
}
class HighProteinMeal implements MealPlan{
    @Override
    public void getMeals(){
        System.out.println("High Protein Meal: Steak, salmon, protein shake");
    }
}
class Meal<T extends MealPlan>{
    private T mealType;
    public Meal(T mealType){
        this.mealType=mealType;
    }
    public void displayMeal(){
        mealType.getMeals();
    }
}
class MealPlanner{
    public static <T extends MealPlan> void generateMealPlan(T meal){
        System.out.println("Generating a personalized meal plan ");
        meal.getMeals();
    }
}
public class PersonalizedMeal{
    public static void main(String[] args){
        Meal<VegetarianMeal> vegetarianMeal=new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal=new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal=new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal=new Meal<>(new HighProteinMeal());
        vegetarianMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        highProteinMeal.displayMeal();
        MealPlanner.generateMealPlan(new VegetarianMeal());
        MealPlanner.generateMealPlan(new VeganMeal());
        MealPlanner.generateMealPlan(new KetoMeal());
        MealPlanner.generateMealPlan(new HighProteinMeal());
    }
}
