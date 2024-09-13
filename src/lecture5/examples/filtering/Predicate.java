package lecture5.examples.filtering;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
