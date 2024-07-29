import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> getAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("12334234", "2344234")),
                new Employee(200, "Ozzy", "ozzy@cydeo.com", Arrays.asList("63224534", "1734523")),
                new Employee(300, "Peter", "peter@cydeo.com", Arrays.asList("3243432", "5323434"))
        );

    }
}
