package lecture5.examples.filtering.car;

@FunctionalInterface
public interface CarPredicate {

    boolean filter(Car car);

}
