package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 8/13/16.
 * The protected keyword
 */
class Villain {
    private String name;
    protected void set(String nm) { name = nm; }
    public Villain(String name) { this.name = name; }
    public String toString() {
        return "I'm Villain and my name is " + name;
    }
}

public class L11_Orc extends Villain {
    private int orcNumber;
    public L11_Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }
    public static void main(String[] args) {
        L11_Orc orc = new L11_Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
