package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(45).build());
        users.add(User.builder().firstName("John").lastName("Evan").age(35).build());
        users.add(User.builder().firstName("Amy").lastName("Hanks").age(35).build());
        users.add(User.builder().firstName("Eva").lastName("Johnson").age(42).build());

        //Print all elements in the list
        printName(users, (user) -> true);

        //Print all users whose last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user: users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
