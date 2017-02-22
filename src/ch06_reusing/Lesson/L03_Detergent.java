package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 5/28/16.
 * Inheritance syntax & properties.
 */

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) {s += a;}
    public void dilute() {append(" dilute()");}
    public void apply() {append(" apply()");}
    public void scrub() {append(" scrub()");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}

public class L03_Detergent extends Cleanser{

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {append(" foam()");}

    public static void main(String[] args) {
        L03_Detergent x = new L03_Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
