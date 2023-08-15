package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);

        //Reference to instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(4,45);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(8,9);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(3,5);

        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer", 6));


        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(55);

        Function<Integer, Double> v2 = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> v3 = MyClass::method;  //If object type is provided, we can reference instance method by class name

        BiFunction<String, String, String> v4 = String::concat;






    }
}
