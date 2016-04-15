package ch04_Initialization.Lesson;

/**
 * Demonstration of both constructor and ordinary method overloading
 * Created by Jienan on 2016/3/11.
 */

class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seedling");
    }

    Tree(int initalHeight) {
        height = initalHeight;
        System.out.println("Creating new Tree that is " +
            height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + "Tree is " + height + " feet tall");
    }
}
public class L03_Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
    }
}
