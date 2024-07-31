import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
        Integer result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        //No initial value
        Optional<Integer> sum2 = numbers.stream().reduce((a, b) -> a + b);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println(min.get());
        System.out.println(max.get());
        System.out.println(sum.get());

        //map and reduce pattern
        Integer mapReduce = DishData.getAll().stream().map(dish -> 1).reduce(0, (a, b) -> a + b);
        System.out.println(mapReduce);

        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);



    }
}
