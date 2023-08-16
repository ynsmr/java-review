import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .map(i-> i*i)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);


        List<int[]> pairs = numbers1.stream()
                .flatMap(n1 -> numbers2.stream().map(n2 -> new int[]{n1, n2}))
                .collect(Collectors.toList());

        pairs.forEach(p -> System.out.println(Arrays.toString(p)));


    }
}
