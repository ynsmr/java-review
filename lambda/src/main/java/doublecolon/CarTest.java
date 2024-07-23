package doublecolon;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero argument
        Supplier<Car> c1 = Car::new;
        c1.get().getModel();

        //One argument
        Function<String, Car> c2 = (make) -> new Car(make);
        System.out.println(c2.apply("BMW").getModel());

        Function<String, Car> c3 = Car::new;
        System.out.println(c3.apply("Honda").getModel());

        //Two argument
        BiFunction<String, Integer, Car> c4 = (make, model) -> new Car(make, model);
        System.out.println(c4.apply("Mazda", 5).getMake());

        BiFunction<String, Integer, Car> c5 = Car::new;
        System.out.println(c5.apply("Honda", 3).getMake());


    }
}
