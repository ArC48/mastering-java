package lecture4.examples.collection.list;

import lecture4.examples.collection.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        Person joni = new Person("Joni", 30);
        Person alex = new Person("Alex", 23);
        Person davit = new Person("Davit", 25);


        //ArrayList
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(joni);
        personArrayList.add(alex);
        personArrayList.add(davit);

        System.out.println(personArrayList.get(0));
        System.out.println(personArrayList);

        personArrayList.remove(davit);
        personArrayList.remove(1);
        System.out.println(personArrayList);

        //Linked List
        List<Person> personLinkedList = new LinkedList<>();
        personLinkedList.add(davit);
        personLinkedList.add(alex);
        personLinkedList.add(joni);

        System.out.println(personArrayList);
    }
}
