package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;


public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //Sorting in ascending order
        Collections.sort(list);
        System.out.println(list);

        //Descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> (o1>o2) ? -1 : (o2>o1) ? 1 : 0);
        System.out.println(list);

        //Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        List<Apple> myInventory = Arrays.asList(
                new Apple(80, Color.RED),
                new Apple(90, Color.GREEN),
                new Apple(70, Color.GREEN),
                new Apple(30, Color.RED)
        );

        Comparator<Apple> sortApple = comparing( apple -> apple.getWeight());
        myInventory.sort(sortApple);

        myInventory.sort(comparing(Apple::getWeight));
        //myInventory.sort(comparing(apple -> apple.getWeight()));

        //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //Chaining
        myInventory
                .sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));





    }
}
