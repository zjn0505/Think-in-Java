package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/3/14.
 */
public class L06_Leaf {
    int i = 0;
    L06_Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        L06_Leaf leaf = new L06_Leaf();
        leaf.increment().increment().increment().increment().print();
    }
}
