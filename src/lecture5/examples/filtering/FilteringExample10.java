package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class FilteringExample10 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);

        List<Integer> priceList = cars.stream()
                .map(Car::getPrice)
                .collect(Collectors.toList());

        System.out.println("Price List: " + priceList);

        String carColors = cars.stream()
                .map(Car::getColor)
                .map(Enum::name)
                .collect(joining(", "));

        System.out.println("Car colors: " + carColors);
    }
}
