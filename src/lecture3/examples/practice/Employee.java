package lecture3.examples.practice;

import java.util.Date;

public class Employee extends Person{
    private Date hireDate;

    private double salary;

    public Employee(String fullName, int age, Date hireDate, double salary) {
        super(fullName, age);
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public double getAmount() {
        return salary;
    }

    public Employee(String fullName) {
        super(fullName);

    }

    public double getSalary() {
        return salary;
    }

}
