package ch06_reusing.Lesson.L06_SpaceShip;

/**
 * Created by jienanzhang on 6/26/16.
 */
public class L06_SpaceShip extends L06_SpaceShipControls{
    private String name;
    public L06_SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        L06_SpaceShip protector = new L06_SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
