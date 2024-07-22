import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(Color.RED, 300));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.GREEN, 250));
        inventory.add(new Apple(Color.RED, 50));

        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());

        System.out.println(heavyApple);
        System.out.println(greenApple);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple each: inventory){

            if (applePredicate.test(each)){
                result.add(each);
            }
        }

        return result;
    }

}
