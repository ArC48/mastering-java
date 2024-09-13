package lecture4.examples;

import lecture3.examples.inheritance.Employee;
import lecture3.examples.inheritance.Manager;
import lecture3.examples.inheritance.Programmer;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee joni = new Programmer("Joni", 1500, 29, 100);
        Employee davit = new Programmer("Davit", 1500, 25, 100);
        Employee alex = new Manager("Alex", 1000, 500, 500);
        Employee tsotne = new Manager("Tsotne", 500, 100, 100);

        list.add(joni);
        list.add(alex);
        list.add(tsotne);
        list.set(0, davit);
        list.remove(alex);

        System.out.println("List size: " + list.size());

        for (Employee employee : list) {
            System.out.println(employee.getName());
        }
    }
}
