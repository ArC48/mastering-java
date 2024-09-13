package lecture4.examples.collection.deque;

import lecture4.examples.collection.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Person levan = new Person("Levan", 28);
        Person alex = new Person("alex", 23);
        Person davit = new Person("davit", 25);

        //Queue FIFO: First in first out
        Queue<Person> queue = new LinkedList<>();
        queue.add(levan);
        queue.add(alex);
        queue.add(davit);

        //element() returns but does not remove head of the queue
        System.out.println("Calling element(): " + queue.element());

        //remove() removes head of the queue and returns
        System.out.println("Calling remove(): " + queue.remove());
        System.out.println("Calling remove(): " + queue.remove());

        System.out.println("Elements after removal: " + queue);
    }
}
