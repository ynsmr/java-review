import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,24,3,9,3,75,6,8);
        myList.forEach(System.out::println);

        //FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(i -> i%3 ==0)
                .distinct() //returns duplicate values only once
                .forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1) //Returns a stream with first element only
                .forEach(System.out::println);

        //SKIP
        System.out.println("SKIP");
        myList.stream()
                .filter(i -> i%2 == 0)
                .skip(1) //Skips the first 1 element
                .forEach(System.out::println);

        //MAP
        System.out.println("MAP");
        myList.stream()
                .map( number -> number*2)
                .filter(i -> i%3 ==0)
                .distinct()
                .forEach(System.out::println);














    }
}
