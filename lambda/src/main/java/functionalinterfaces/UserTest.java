package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Smith", 54));
        users.add(new User("Tom", "Hanks", 63));
        users.add(new User("Steve", "Walt", 24));
        users.add(new User("Angela", "Eugene", 24));
        users.add(new User("Micheal", "Ennor", 24));

        //Print all elements in the list
        printName(users, p -> true);


//        Consumer<List<User>> printUsers = userList -> {
//            for (User each : userList){
//                System.out.println(each);
//            }
//        };




        //Print all users whose last name start with E

        printName(users, p -> p.getLastName().startsWith("E")); //We can pass lambda directly as a parameter


    }

    private static void printName(List<User> userList, Predicate<User> userPredicate){
        for (User user: userList){
            if (userPredicate.test(user)){
                System.out.println(user);
            }
        }
    }


}
