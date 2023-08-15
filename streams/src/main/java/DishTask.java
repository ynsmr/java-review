import java.util.Arrays;
import java.util.List;

public class DishTask {
    public static void main(String[] args) {
        //TASK-2
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        menu.stream()
                .filter(i -> i.getCalories()<400)
                .forEach(i -> System.out.println(i.getName()));

        System.out.println("--------------------------------");

        menu.stream()
                .filter(i -> i.getCalories()<400)
                .map(i -> i.getName())
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        //TASK-3

        menu.stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);




    }
}
