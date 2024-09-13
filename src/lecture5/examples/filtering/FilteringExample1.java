package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample1 {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);
        Car car2 = new Car(Color.BLACK, 20000);
        Car car3 = new Car(Color.RED, 35000);
        Car car4 = new Car(Color.WHITE, 50000);
        Car car5 = new Car(Color.RED, 72000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);

        List<Car> redCars = filterRedCars(cars);
        System.out.println("Red cars: " + redCars);

        List<Car> expensiveCars = filterExpensiveCars(cars);
        System.out.println("Expensive cars: " + expensiveCars);

        List<Car> blackCars = filterCarsByColor(cars, Color.WHITE);
        System.out.println("White cars: " + blackCars);

        List<Car> whiteCars = filterCars(cars, Color.WHITE, 0, true);
        List<Car> byPrice = filterCars(cars, null, 1500, false);
        System.out.println("White cars: " + whiteCars);
        System.out.println("By price: " + byPrice);
    }

    public static List<Car> filterRedCars(List<Car> cars) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() == Color.RED) {
                result.add(car);
            }
        }
        return result;
    }


    public static List<Car> filterExpensiveCars(List<Car> cars) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPrice() > 20000) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> filterCarsByColor(List<Car> cars, Color color) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() == color) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> filterCars(List<Car> cars, Color color, int price, boolean flag) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if ((flag && car.getColor() == color) || (!flag && car.getPrice() > price)) {
                result.add(car);
            }
        }
        return result;
    }
}
