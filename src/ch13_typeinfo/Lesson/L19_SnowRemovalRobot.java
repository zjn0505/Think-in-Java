package ch13_typeinfo.Lesson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Jienan on 2017/4/7.
 */
public class L19_SnowRemovalRobot implements L19_Robot {
    private String name;
    public L19_SnowRemovalRobot(String name) { this.name = name; }
    public String name() { return name; }
    public String model() { return "SnowBot Series 11"; }
    public List<L19_Operation> operations() {
        return Arrays.asList(
                new L19_Operation() {
                    @Override
                    public String description() {
                        return name + " can shovel snow";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new L19_Operation() {
                    @Override
                    public String description() {
                        return name + " can chip ice";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new L19_Operation() {
                    @Override
                    public String description() {
                        return name + " can clear the roof";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " clearing the roof");
                    }
                }
        );
    }

    public static void main(String[] args) {
        L19_Robot.Test.test(new L19_SnowRemovalRobot("Slusher"));
    }
}
