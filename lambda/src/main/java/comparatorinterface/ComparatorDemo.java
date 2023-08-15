package comparatorinterface;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingLong;

public class ComparatorDemo {
    public static void main(String[] args) {


        List<Integer> list =Arrays.asList(10,3,64,67,3,4);
        System.out.println(list);

        //Ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> (o1>o2) ? -1 : (o2==o1) ? 0:1);
        System.out.println(list);

        //Ascending order
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);


        list.sort((o2,o1)-> o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(125, Color.RED),
                new Apple(185, Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing((apple)-> apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println(myInventory);

        myInventory.sort(comparing((apple) -> apple.getWeight()));
        myInventory.sort(comparing(Apple::getWeight));

        //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //Chaining the comparator methods
        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(myInventory);


    }
}
