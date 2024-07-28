import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating Stream from array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> courseStream = Arrays.stream(courses);

        //Creating stream from collection
        List<String> courseList = Arrays.asList("Java", "JS", "TS");
        Stream<String> coursestream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("Spring", 101),
                new Course("JS", 103),
                new Course("MicroServices", 104)
        );

        Stream<Course> myCourseStream = myCourses.stream();


        //Creating stream from values
        Stream<Integer> streamValues = Stream.of(1, 2, 3, 4);







    }
}
