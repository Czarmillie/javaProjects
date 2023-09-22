package Arrays;
import java.util.*;

public abstract class DoublyLinkedList<E> implements List<E>, Deque<E> {
    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        Node(E element) {
            this.data = element;
            this.prev = null;
            this.next = null;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void add(int index, E element) {
    }
}
