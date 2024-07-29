import java.util.Comparator;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        System.out.println("************************");
        DishData.getAll().stream()
                .filter(d -> d.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);


        //Print the length of the name of each dish
        System.out.println("*************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        //Print three high caloric dish name (>300)
        System.out.println("*************");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories sorted

        System.out.println("*************");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed()) //sort before mapping
                .map(Dish::getName)
                .forEach(System.out::println);









    }
}
