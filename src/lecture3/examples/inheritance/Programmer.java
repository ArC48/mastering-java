package lecture3.examples.inheritance;

import lecture4.examples.exception.CustomException;

public class Programmer extends Employee {

    public double insurance;

    @Override
    public double getIncome() throws CustomException {
        return super.getSalary() + insurance;
    }

    public Programmer(String name, double salary, int age, double insurance) {
        super(name, salary, age);
        this.insurance = insurance;
    }
}
