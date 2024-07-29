import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails - One employee has one email - One to One
        EmployeeData.getAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //Print all the phone numbers
        EmployeeData.getAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        System.out.println("****************************");
        EmployeeData.getAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream()) //We are passing  a stream of streams
                .forEach(System.out::println);

        System.out.println("***********************");
        EmployeeData.getAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);




















    }
}
