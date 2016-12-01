package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 8/13/16.
 */

class Frog2 extends Amphibian {
    @Override
    public void moveInWater() {
        System.out.println("Frog swimming");
    }

    @Override
    public void moveOnLand() {
        System.out.println("Frog jumping");
    }
}
public class E17_Frog2 {
    public static void main(String[] args) {
        Amphibian a = new Frog2();
        a.moveOnLand();
        a.moveInWater();
    }
}
