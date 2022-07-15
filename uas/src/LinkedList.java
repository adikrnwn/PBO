import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item> {

    private Node first = new Node();

    @Override
    public Iterator<Item> iterator() {
        {
            return new ListIterator();
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    public void InsertFirst(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}

