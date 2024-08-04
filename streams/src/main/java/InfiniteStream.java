import java.util.Arrays;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {

        Stream.iterate(0, n-> n+2)
                .limit(5)
                .forEach(System.out::println);


        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+arr[1]})
                .limit(20)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));


        System.out.println("**********************************");
        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+arr[1]})
                .limit(20)
                .map(t -> t[0])
                .forEach(System.out::println);




    }
}
