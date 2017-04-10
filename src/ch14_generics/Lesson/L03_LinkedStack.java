package ch14_generics.Lesson;

/**
 * Created by Jienan on 2017/4/10.
 */
// A stack implemented with an internal linked structure.

public class L03_LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() { item = null; next = null; }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() { return item == null && next == null; }
    }
    private Node<T> top = new Node<T>(); // End sentinel
    public void push(T item) {
        top = new Node<T>(item, top);
    }
    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        L03_LinkedStack<String> lss = new L03_LinkedStack<String>();
        for (String s : "Phasers or stun!".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}

