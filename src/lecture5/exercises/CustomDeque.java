package lecture5.exercises;

/*
    მოახდინეთ CustomDequeue კლასის იმპლემენტაცია Node კლასის დახმარებით
 */
public class CustomDeque<T> {

    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }


    public CustomDeque() {

    }


    public void addFirst(T data) {

    }

    public void addLast(T data) {

    }

    public T removeFirst() {
        return null;
    }

    public T removeLast() {
        return null;
    }

    public T peekFirst() {
        return null;
    }

    public T peekLast() {
        return null;
    }

    public int size() {
        return 0;
    }

}
