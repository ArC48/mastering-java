package lecture3.examples.inheritance;

import lecture4.examples.exception.CustomException;
import lecture4.examples.exception.ErrorType;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person {

    private double salary;

    private Date hireDay;

    public Employee(String name, double salary, int age) {
        super(name, age);
        this.salary = salary;
        this.hireDay = new Date();
    }

    public double getIncome() throws ClassNotFoundException, CustomException {
        if (salary < 0 ) {
            throw new ClassNotFoundException();
        }
        return getIncome();
    }

    public double getSalary() throws CustomException {
        if (salary < 0) {
            throw new CustomException(ErrorType.SERVER_ERROR, "Salary can't be less than 0");
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
