package lecture2.examples;

public class Car {

    private String model;

    private String color;

    private int km;

    private int price;

    private int gear;

    public Car(String model, String color, int km, int price, int gear) {
        this.model = model;
        this.color = color;
        this.km = km;
        this.price = price;
        this.gear = gear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String start() {
        return "Start " + model;
    }

    public void stop() {
        System.out.println("Stop " + model);
    }

    public void shiftGear(int gear) {
        this.gear = gear;
        System.out.println("Gear shifted to: " + gear);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }
}
