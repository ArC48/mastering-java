package lecture4.examples.collection.list;

import java.util.Iterator;

public class DynamicSizeList<E> implements Iterable<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size;

    private E[] elements;

    public DynamicSizeList() {
        size = 0;
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return elements[index];
    }

    public void add(E element) {
        if (size == elements.length) {
            resize(2 * elements.length);
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if (size == elements.length) {
            resize(2 * elements.length);
        }

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[size++] = element;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        E oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }

    public void remove(E element) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                indexToRemove = i;
                break;
            }
        }
        for (int i = indexToRemove + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        if (size > 0 && size == elements.length / 4) resize(elements.length / 2);
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
    }

    private void resize(int max) {
        E[] temp = (E[]) new Object[max];
        for (int i = 0; i < size; i++)
            temp[i] = elements[i];
        elements = temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {
        int cursor = 0;

        int previous = -1;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public E next() {
            E next = get(cursor);
            previous = cursor;
            cursor++;
            return next;
        }

        @Override
        public void remove() {
            if (previous < 0) {
                throw new IllegalStateException();
            }

            DynamicSizeList.this.remove(previous);
            cursor--;
            previous = -1;
        }
    }
}
