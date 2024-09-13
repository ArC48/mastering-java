package lecture5.examples.filtering.car;

import java.util.Objects;

public class Car {

    private Color color;

    private int price;

    public Car(Color color, int price) {
        this.color = color;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", price=" + price +
                '}';
    }
}
