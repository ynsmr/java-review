import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier): is used to create a collection using collector
        System.out.println("-------------toCollection()--------------");
        List<Integer> numberList = numbers.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList: returns a collector interface that gathers the input data into a new list
        System.out.println("-------------toList()--------------");
        List<Integer> numberList2 = numberList.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

        //toSet(): returns a Collector interface that gathers the input data into a new set
        System.out.println("-------------toSet()--------------");
        Set<Integer> numberSet2 = numberList.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numberSet2);

        System.out.println("-----------toMap()-------------");
        //toMap(Function, Function): returns a collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);

        System.out.println("-----------counting()---------");
        //counting(): returns a collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        System.out.println("-------summingInt()----------");
        //summingInt(ToIntFunction): returns a collector that produces the sum of a integer valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        System.out.println("---------averagingInt()---------");
        //averageingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAvg);

        System.out.println("---------joining()---------");
        //joining(): is used to join various elements of a character or string array into a single string object
        List<String> courses = Arrays.asList("Java", "JS", "TS");

        String collect = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(collect);
        System.out.println(courses);

        System.out.println("-------------partitioningBy()-------------");
        //partitioningBy(): is used to partition a stream of objects(or set of elements) based on a given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(veggieDish);

        System.out.println("---------grouping()-----------");
        //groupingBy(): is used for grouping objects by some property and storing results in a map instance
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);


    }
}
