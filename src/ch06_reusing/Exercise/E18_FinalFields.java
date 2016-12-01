package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 8/14/16.
 */
/****************** Exercise 18 *****************
 * Create a class with a static final field and a
 * final field and demonstrate the difference
 * between the two.
 ***********************************************/

class SelfCounter {
    private static int count = 0;
    private int id = count++;
    public String toString() {return "SelfCounter " + id;}

}

class WithFinalFields {
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter scsf = new SelfCounter();
    public String toString() {
        return "scf = " + scf + "\nscsf = " + scsf;
    }
}


public class E18_FinalFields {
    public static void main(String[] args) {
        System.out.println("First object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
    }
}
