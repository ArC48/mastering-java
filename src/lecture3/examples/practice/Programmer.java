package lecture3.examples.practice;

import java.util.Date;

public class Programmer extends Employee {
    private double bonus;

    public Programmer(String fullName, int age, Date hireDate, double salary, double bonus) {
        super(fullName, age, hireDate, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAmount() {
        return getSalary() + bonus;
    }
}
