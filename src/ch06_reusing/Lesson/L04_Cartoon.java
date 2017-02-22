package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 6/25/16.
 * Constructor calls during inheritance
 */

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class L04_Cartoon extends Drawing{
    public L04_Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        L04_Cartoon cartoon = new L04_Cartoon();
    }
}
