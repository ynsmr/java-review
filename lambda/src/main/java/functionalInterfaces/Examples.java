package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //************PREDICATE***********
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);

        Predicate<Integer> lesserThan = i -> i<18;

        System.out.println(lesserThan.test(8));

        //***********CONSUMER**********
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(56);

        //********BICONSUMER***********

        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(56,534);

        //*********FUNCTION*********
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Ozzy"));

        //**********SUPPLIER**********
        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());

        Predicate<Integer> pred = (p) -> p%2==0? true:false;
        System.out.println(pred.test(9));

        BiConsumer<Integer,Integer> printSum = (x,y) -> System.out.println(x+y);
        printSum.accept(6,15);






    }
}
