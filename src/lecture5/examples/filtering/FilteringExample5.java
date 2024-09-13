package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample5 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);

        List<Integer> integers = List.of(5, 2, 8, 11, 7, 98);

        List<Car> expensiveCars = filter(cars, car -> car.getPrice() > 20000);
        System.out.println("Expensive cars: " + expensiveCars);

        List<Integer> eventIntegers = filter(integers, integer -> integer % 2 == 0);
        System.out.println("Event integers: " + eventIntegers);


    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
