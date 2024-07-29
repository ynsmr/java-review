import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //allMatch()
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //anyMatch()
        boolean isVegetarian = DishData.getAll().stream().anyMatch(dish -> dish.isVegetarian());
        System.out.println(isVegetarian);

        //noneMatch()
        boolean notHighlyCaloric = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() > 900);
        System.out.println(notHighlyCaloric);

        //findAny()
        Optional<Dish> anyDish = DishData.getAll().stream().findAny();
        System.out.println(anyDish.get());

        //findFirst()
        Optional<Dish> firstDish = DishData.getAll().stream().findFirst();
        System.out.println(anyDish.get());







    }
}
