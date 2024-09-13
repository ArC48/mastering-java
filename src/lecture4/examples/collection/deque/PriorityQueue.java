package lecture4.examples.collection.deque;

import lecture4.examples.collection.Person;

import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {
        Person levan = new Person("Levan", 28);
        Person alex = new Person("alex", 23);
        Person davit = new Person("davit", 25);
        Person salome = new Person("salome", 27);

        //Priority queue
        Queue<Person> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add(levan);
        priorityQueue.add(alex);
        priorityQueue.add(davit);
        priorityQueue.add(salome);

        //When iterating elements are not ordered according to comparable interface
        for (Person person : priorityQueue) {
            System.out.println(person);
        }

        System.out.println();

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
