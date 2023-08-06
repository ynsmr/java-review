import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleFormatTest {
    public static void main(String[] args) {
        Apple a1 = new Apple(160, Color.GREEN);
        Apple a2 = new Apple(130, Color.RED);
        Apple a3 = new Apple(170, Color.RED);
        Apple a4 = new Apple(110, Color.GREEN);

        List<Apple> appleBasket = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));
        prettyPrint(appleBasket, new AppleSimpleFormatter());


    }

    public static void prettyPrint(List<Apple> basket, AppleFormatter af){
        for(Apple apple: basket){
            af.format(apple);
        }
    }
}
