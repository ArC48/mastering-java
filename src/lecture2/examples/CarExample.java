package lecture2.examples;


public class CarExample {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw", "Red", 100, 10000, 1);
        Car audi = new Car("Audi", "Black", 150, 15000, 1);

        System.out.println(bmw.getModel());
        System.out.println(audi.getModel());
    }
}
