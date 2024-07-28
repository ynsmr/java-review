import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,1,2,3,5,6,8);
        myList.forEach(System.out::println);  //default method of iterable interface

        //filter(Predicate<T>), distinct()
        System.out.println("FILTER");
        myList.stream()
                .filter(x -> x%2 == 0)
                .distinct()
                .forEach(System.out::println);


        //limit(int)
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2 == 0)
                .limit(1)  //Limits the size with first element only
                .forEach(System.out::println);


        //skip(int)
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2 == 0)
                .skip(2)  //Skips first two elements
                .distinct()
                .forEach(System.out::println);

        //map(Function<T, R>)
        System.out.println("MAP");
        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3 == 0)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
























    }
}
