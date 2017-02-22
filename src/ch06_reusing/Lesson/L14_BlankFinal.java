package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 8/14/16.
 */

class Poppet {
    private int i;
    Poppet(int ii) {i = ii;}
}

public class L14_BlankFinal {
    private final int i = 0;
    private final int j; // Blank final
    private final Poppet p; // Blank final reference
    public L14_BlankFinal() {
        j = i;
        p = new Poppet(1);
    }
    public L14_BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new L14_BlankFinal();
        new L14_BlankFinal(47);
    }
}
