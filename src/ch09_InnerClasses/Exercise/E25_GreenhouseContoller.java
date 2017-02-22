package ch09_InnerClasses.Exercise;

import ch09_InnerClasses.Lesson.L25_GreenhouseControls;
import ch09_InnerClasses.Lesson.controller.Event;

/**
 * Created by Jienan on 2017/2/21.
 */
// {Args: 5000}
/****************** Exercise 25 ******************
 * Inherit from GreenhouseControls in
 * GreenhouseControls.java to add Event inner
 * classes that turn water mist generators on
 * and off. Write a new version of
 * GreenhouseController.java to use these new
 * Event objects.
 ***********************************************/
class GreenhouseControlsWithWMG extends L25_GreenhouseControls {
    private boolean generator = false;
    public class WatermistGeneratorOn extends Event {
        public WatermistGeneratorOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            generator = true;
        }
        public String toString() {
            return "Water mist generator is on";
        }
    }
    public class WatermistGeneratorOff extends Event {
        public WatermistGeneratorOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            generator = false;
        }
        public String toString() {
            return "Water mist generator is off";
        }
    }
}

public class E25_GreenhouseContoller {
    public static void main(String[] args) {
        GreenhouseControlsWithWMG gc = new GreenhouseControlsWithWMG();
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new WatermistGeneratorOn(1600),
                gc.new WatermistGeneratorOff(1800)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new L25_GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}
