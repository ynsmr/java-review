import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("244324234", "3242342")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("67435234", "6235252")),
                new Employee(102, "John", "john@cydeo.com", Arrays.asList("52345233", "62352334"))
        );
    }
}
