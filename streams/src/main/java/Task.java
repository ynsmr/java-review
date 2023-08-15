import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .forEach(i -> System.out.println(i.length()));

        System.out.println("------------------------------------");

        words.stream()
                .map(i -> i.length())
                .forEach(System.out::println);
    }
}
