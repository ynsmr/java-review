package review;

public class CarTest {
    public static void main(String[] args) {

        Car car = Car.builder().make("Toyota").topSpeed(150).year(2020).build();
        // With builder we can initialize any number of fields.
        // We don't have initialize any certain number
        System.out.println(car);





    }
}
