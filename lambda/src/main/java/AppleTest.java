import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(Color.RED, 300));
        inventory.add(new Apple(Color.GREEN, 100));
        inventory.add(new Apple(Color.GREEN, 250));
        inventory.add(new Apple(Color.RED, 50));

//        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());

        List<Apple> heavyApple = filterApples(inventory, apple -> apple.getWeight()>200);
        List<Apple> greenApple = filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));

        System.out.println(heavyApple);
        System.out.println(greenApple);
    }

//    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
//
//        List<Apple> result = new ArrayList<>();
//
//        for (Apple each: inventory){
//
//            if (applePredicate.test(each)){
//                result.add(each);
//            }
//        }
//
//        return result;
//    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple each: inventory){

            if (applePredicate.test(each)){
                result.add(each);
            }
        }

        return result;
    }

}
