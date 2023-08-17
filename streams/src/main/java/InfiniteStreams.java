import java.util.Arrays;
import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {

        Stream.iterate(0, n->n+2)
                .limit(5)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(6)
                .forEach(System.out::println);

        //FIBONACCI TASK
        Stream.iterate(new int[]{0,1}, a-> new int[]{a[1], a[0]+a[1]})
                .limit(20)
                .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));

        //FIBONACCI REGULAR
        int[] origin = {0, 1};
        int firstIndex;

        for (int i=0; i<20; i++){
            System.out.println(Arrays.toString(origin));
            firstIndex = origin[0];
            origin[0]= origin[1];
            origin[1]= firstIndex+origin[1];
        }

    }
}
