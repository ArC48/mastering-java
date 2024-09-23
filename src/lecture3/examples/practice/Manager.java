package lecture3.examples.practice;

import java.util.Date;

public class Manager extends Programmer {
    private double stocks;

    public Manager(String fullName, int age, Date hireDate, double salary, double bonus, double stocks) {
        super(fullName, age, hireDate, salary, bonus);
        this.stocks = stocks;
    }
}
