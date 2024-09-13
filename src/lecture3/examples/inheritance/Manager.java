package lecture3.examples.inheritance;

import lecture4.examples.exception.CustomException;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, int age, double salary, double bonus) {
        super(name, salary, age);
        this.bonus = bonus;
    }

    @Override
    public double getIncome() throws CustomException {
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
