package ch06_reusing.Lesson.L06_SpaceShip;

/**
 * Created by jienanzhang on 6/26/16.
 */
public class L06_SpaceShipDelegation {
    private String name;
    private L06_SpaceShipControls controls = new L06_SpaceShipControls();
    public L06_SpaceShipDelegation(String name) {
        this.name = name;
    }

    void up(int volecity) {
        controls.up(volecity);
    }
    void down(int velocity) {
        controls.down(velocity);
    }
    void left(int velocity) {
        controls.left(velocity);
    }
    void right(int velocity) {
        controls.right(velocity);
    }
    void forward(int velocity) {
        controls.forward(velocity);
    }
    void back(int velocity) {
        controls.back(velocity);
    }
    void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        L06_SpaceShipDelegation protector = new L06_SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
