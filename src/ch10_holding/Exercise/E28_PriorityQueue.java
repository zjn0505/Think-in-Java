package ch10_holding.Exercise;

/**
 * Created by jienanzhang on 04/03/2017.
 */

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/****************** Exercise 28 *****************
 * Fill a PriorityQueue (using offer()) with
 * Double values created using java.util.Random,
 * then remove the elements using poll() and
 * display them.
 ***********************************************/
public class E28_PriorityQueue {
    static Random rand = new Random(47);
    public static void printQ(Queue<?> queue) {
        for(Object data = queue.poll(); data != null;
                data = queue.poll()) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue =
                new PriorityQueue<Double>();
        for (int i = 0; i < 10; i++)
            priorityQueue.offer(rand.nextDouble());
        printQ(priorityQueue);
    }
}
