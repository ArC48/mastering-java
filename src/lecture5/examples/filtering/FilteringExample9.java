package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class FilteringExample9 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);

        Map<Color, List<Car>> carsByColor = new HashMap<>();
        for (Car car : cars) {
            Color color = car.getColor();
            List<Car> carList = carsByColor.get(color);
            if (carList == null) {
                carList = new ArrayList<>();
                carsByColor.put(color, carList);
            }
            carList.add(car);
        }

        System.out.println(carsByColor);

        carsByColor = cars.stream()
                .collect(groupingBy(Car::getColor));

        System.out.println(carsByColor);
    }
}
