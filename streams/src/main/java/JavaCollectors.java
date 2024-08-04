import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7,70);

        //toCollection(Supplier) : is used to create a collection using collector

        System.out.println("******************TO COLLECTION***************");
        List<Integer> listOfNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(listOfNumbers);

        HashSet<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList() : returns a collector interface that gathers data into a new list
        System.out.println("**************TOLIST()*****************");

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList);

        //toSet() : returns a collector interface that gathers the input fata into a new set
        System.out.println("****************TOSET()***********");

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        //toMap(Function, Function) : returns a collector interface that gathers the input data into a new map
        System.out.println("****************MAP()****************");
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);


        //counting () : returns a collector that counts the number of the elements
        System.out.println("************COUNTING()****************");

        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(ToIntFunction) : returns a collector that produces the sum of a integer-valued function
        System.out.println("***********SUMMINGINT()***********");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //averagingInt(ToIntFunction)
        System.out.println("***************AVERAGINGINT()*************");

        Double avgCalories = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(avgCalories);

        //joining() : is used to join various elements of a character or string array into a single string object
        System.out.println("*****************JOINING()**************");

        List<String> courses = Arrays.asList("JAVA", "JS", "TS");

        String stringCourses = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(stringCourses);

        //partitioningBy() : is used to partition a stream of objects (or set of elements) based on a given predicate
        System.out.println("*******************PARTITIONINGBY()******************");

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        System.out.println("***************GROUPINGBY()****************");
        Map<Type, List<Dish>> dishTypes = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishTypes);


    }
}
