package ch06_reusing.Exercise;

import ch06_reusing.Lesson.L03_Detergent;

/******************** Exercise 2 ****************
 * Created by jienanzhang on 6/25/16.
 * reusing/E02_NewDetergent.java
 /
 * Inherit a new class from class Detergent.
 * Override scrub() and add a new method called
 * sterilize().
 ***********************************************/
class E02_NewDetergent extends L03_Detergent {

    @Override
    public void scrub() {
        append(" NewDetergent.scrub");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {
        E02_NewDetergent newDetergent = new E02_NewDetergent();
        newDetergent.dilute();
        newDetergent.scrub();
        newDetergent.sterilize();
        System.out.println(newDetergent);
    }
}
