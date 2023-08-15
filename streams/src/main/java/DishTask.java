import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

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
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        //TASK-3

        menu.stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        //Print Three High Caloric Dish Name(>300)
        System.out.println("------------------------------------------");
        menu.stream()
                .filter(c -> c.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //print all dish name that are below 400 calories in sorted
        System.out.println("------------------------------");

        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);











    }
}
