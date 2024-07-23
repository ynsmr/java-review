package doublecolon;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {

        //Reference to a static method
        //Calculate s1 = (x, y) -> Calculator.findSum(x,y);
        Calculate s1 = Calculator::findSum;  // ClassName::methodName
        s1.calculate(5,10);


//        Calculate s3 = Calculator::testingMethod; ==== Parameters do not match
//        s3.calculate(10);


        //Reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x, y);
        m1.calculate(10,5);

        Calculate m2 = new Calculator()::findMultiply;  //obj::methodName
        m2.calculate(10,5);

        Calculator obj = new Calculator();
        Calculate m3 = obj::findMultiply;
        m3.calculate(10,5);

        //BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> fn = String::substring;
        System.out.println(fn.apply("MOTHERFUCKER", 5));

        Consumer<Integer> display = System.out::println;






    }
}
