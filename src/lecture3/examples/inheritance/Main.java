package lecture3.examples.inheritance;


import lecture4.examples.exception.CustomException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Employee joni = new Employee("Joni", 1500, 30);
        Employee alex = new Programmer("Alex", 1000, 23, 500);
        Employee tsotne = new Manager("Tsotne", 35, 1000, 10);

        List<Employee> employeesList = new ArrayList<>();

        employees[0] = joni;
        employees[1] = alex;
        employees[2] = tsotne;

        printIncomes(employees);
    }

    public static void printIncomes(Employee[] employees) {
        for (Employee employee : employees) {
            //System.out.println(employee.getIncome());
        }
    }
}
