package review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

       // Car car = Car.builder().make("Toyota").topSpeed(150).year(2020).build();
        // With builder we can initialize any number of fields.
        // We don't have initialize any certain number
        // System.out.println(car);

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 145, 1998));
        carList.add(new Car("Audi", 165, 1995));
        carList.add(new Car("Mercedes", 185, 2015));
        carList.add(new Car("Nissan", 175, 2017));

        System.out.println("Fast Cars");
//        System.out.println(filterFastCars(carList));

        System.out.println(filter(carList, new CarFastPredicate()));

        System.out.println("New Cars");
//        System.out.println(filterNewCars(carList));

        System.out.println(filter(carList, new CarNewPredicate()));

        //Assign lambda to instance of interface
        CarPredicate carPredicate = (Car car) -> car.getTopSpeed() > 160;
        System.out.println(filter(carList, carPredicate));

        //Pass lambda directly
        System.out.println(filter(carList, car -> car.getTopSpeed() > 160));

        








    }

//    private static List<Car> filterFastCars(List<Car> cars){
//
//        List<Car> filteredCars = new ArrayList<>();
//
//        for (Car car: cars){
//
//            if (car.getTopSpeed()>160){
//                filteredCars.add(car);
//            }
//        }
//
//        return filteredCars;
//    }
//
//    private static List<Car> filterNewCars(List<Car> cars){
//
//        List<Car> filteredCars = new ArrayList<>();
//
//        for (Car car: cars){
//
//            if (car.getYear()>2015){
//                filteredCars.add(car);
//
//            }
//        }

//        return filteredCars;
//    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car: cars){
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }
}
