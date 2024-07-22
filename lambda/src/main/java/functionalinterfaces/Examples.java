package functionalinterfaces;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

        //***********PREDICATE*************
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };//Anonymous class
//
//        lesserThan.test(50);

        Predicate<Integer> lesserThan = integer -> integer<18;  //implementation of test() method that belong to Predicate Interface
        System.out.println(lesserThan.test(19));

        //***********CONSUMER***********
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(5);

        //********BICONSUMER*********
        BiConsumer<Integer, Integer> biDisplay = (a, b) -> System.out.println(a+b);
        biDisplay.accept(8,9);

        //*********FUNCTION**********
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("MOTHERFUCKER!"));

        //********SUPPLIER*********
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());




    }
}
