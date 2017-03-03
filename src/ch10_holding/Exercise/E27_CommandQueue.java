package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/3/3.
 */

import java.util.LinkedList;
import java.util.Queue;

/****************** Exercise 27 *****************
 * Write a class called Command that contains a
 * String and has a method operation() that
 * displays the String. Write a second class with
 * a method that fills a Queue with Command objects
 * and returns it. Pass the filled Queue to a method
 * in a third class that consumes the objects in the
 * Queue and calls their operation() methods.
 ***********************************************/
class Command {
    Command(String s) {
        this.s = s;
    }
    private final String s;
    void operation() {
        System.out.println(s);
    }
}

class Producer {
    public static void produce(Queue<Command> queue) {
        queue.offer(new Command("load"));
        queue.offer(new Command("delete"));
        queue.offer(new Command("save"));
        queue.offer(new Command("exit"));
    }
}

class Consumer {
    public static void consume(Queue<Command> q) {
        while (q.peek() != null) {
            q.remove().operation();
        }
    }
}

public class E27_CommandQueue {
    public static void main(String[] args) {
        Queue<Command> q = new LinkedList<Command>();
        Producer.produce(q);
        Consumer.consume(q);
    }
}
