package lecture4.examples.collection.list;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    Node<E> first;
    Node<E> last;

    private int size;

    public int size() {
        return size;
    }

    public E get(int index) {
        return getNode(index).item;
    }

    public void add(E element) {
        Node<E> previousLast = last;
        Node<E> newNode = new Node<>(previousLast, element, null);
        last = newNode;
        if (previousLast == null) {
            first = newNode;
        }
        else {
            previousLast.next = newNode;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (index == size) {
            add(element);
        } else {
            Node<E> succ = getNode(index);
            Node<E> pred = succ.prev;
            Node<E> newNode = new Node<>(pred, element, succ);
            succ.prev = newNode;
            if (pred == null) {
                first = newNode;
            }
            else {
                pred.next = newNode;
            }
            size++;
        }
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        Node<E> toReplace = getNode(index);
        E oldValue = toReplace.item;
        toReplace.item = element;

        return oldValue;
    }

    public void remove(E element) {
        Node<E> current = first;
        while (current.next == null) {
            if (current.item == element) {
                if (current.prev == null) {
                    first = current.next;
                } else {
                    current.prev.next = current.next;
                    current.prev = null;
                }

                if (current.next == null) {
                    last = current.prev;
                } else {
                    current.next.prev = current.prev;
                    current.next = null;
                }
                current.item = null;
                size--;
            }
        }
    }

    public void remove(int index) {
        remove(getNode(index).item);
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {

        private Node<E> current = first;
        private Node<E> previous = null;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E element = current.item;
            previous = current;
            current = current.next;
            return element;
        }

        @Override
        public void remove() {
            if (previous != null) {
                throw new IllegalStateException();
            }
            E element = previous.item;
            previous = null;
            LinkedList.this.remove(element);
        }
    }
}
