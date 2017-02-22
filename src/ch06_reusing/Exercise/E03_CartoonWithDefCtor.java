package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 6/25/16.
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

public class E03_CartoonWithDefCtor extends Drawing {
    public static void main(String[] args) {
        new E03_CartoonWithDefCtor();
    }
}
