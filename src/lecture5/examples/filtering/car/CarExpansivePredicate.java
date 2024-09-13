package lecture5.examples.filtering.car;

public class CarExpansivePredicate implements CarPredicate {

    @Override
    public boolean filter(Car car) {
        return car.getPrice() > 20000;
    }
}
