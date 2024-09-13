package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.CarPredicate;
import lecture5.examples.filtering.car.Color;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample3 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);

        class CarRedPredicate implements CarPredicate {

            @Override
            public boolean filter(Car car) {
                return car.getColor() == Color.RED;
            }
        }

        CarRedPredicate carRedPredicate = new CarRedPredicate();

        List<Car> redCars = filterCars(cars, carRedPredicate);
        System.out.println("Red cars: " + redCars);

        List<Car> expensiveCars = filterCars(cars, new CarPredicate() {
            @Override
            public boolean filter(Car car) {
                return car.getPrice() > 20000;
            }
        });
        System.out.println("Expensive cars: " + expensiveCars);
    }

    public static List<Car> filterCars(List<Car> cars, CarPredicate carPredicate) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.filter(car)) {
                result.add(car);
            }
        }
        return result;
    }
}
