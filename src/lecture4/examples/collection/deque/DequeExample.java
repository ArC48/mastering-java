package lecture4.examples.collection.deque;

import lecture4.examples.collection.Person;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    //Deque can be used as a stack and queue
    public static void main(String[] args) {
        Person levan = new Person("Levan", 28);
        Person alex = new Person("alex", 23);
        Person davit = new Person("davit", 25);
        Person salome = new Person("salome", 27);

        //Using deque as a stack
        Deque<Person> stack = new ArrayDeque<>();
        stack.push(levan);
        stack.push(alex);
        stack.push(davit);

        //poll(), Returns top of the stack
        System.out.println("Calling poll(): " + stack.poll());

        //pop(), Removes and returns top of the stack
        System.out.println("Calling pop(): " + stack.pop());
        System.out.println("Elements after removal: " + stack);
        System.out.println();


        //Using dequeue
        Deque<Person> deque = new ArrayDeque<>();
        deque.addFirst(levan);
        deque.addFirst(alex);
        deque.addLast(davit);
        deque.addLast(salome);
        System.out.println(deque);

        deque.removeFirst();
        deque.removeFirst();

        System.out.println("Elements after removal: " + deque);
    }
}
