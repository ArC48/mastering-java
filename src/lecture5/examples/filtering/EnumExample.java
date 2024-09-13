package lecture5.examples.filtering;

import lecture5.examples.filtering.car.Car;
import lecture5.examples.filtering.car.Color;

public class EnumExample {

    public static void main(String[] args) {
        Car car1 = new Car(Color.WHITE, 15000);

        //Enum string names
        for (Color value : Color.values()) {
            System.out.println(value.name());

        }

        //Ordinal value
        for (Color value : Color.values()) {
            System.out.println(value.ordinal());
        }

        //Enum form the string
        Color colorFromString = Color.valueOf("WHITE");
    }
}
