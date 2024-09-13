package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilteringExample6 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);


        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(cars);


        cars.sort((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));

        cars.sort((o1, o2) -> {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        });
    }
}
