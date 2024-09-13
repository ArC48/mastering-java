package lecture5.examples.filtering.car;

import static lecture5.examples.filtering.car.Color.RED;

public class CarRedPredicate implements CarPredicate {

    @Override
    public boolean filter(Car car) {
        return RED == car.getColor();
    }
}
