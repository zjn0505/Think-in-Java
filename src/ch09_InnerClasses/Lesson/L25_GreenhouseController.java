package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Lesson.L25_GreenhouseControls;
import ch09_InnerClasses.Lesson.controller.Event;

/**
 * Created by Jienan on 2017/2/21.
 */

// Configure and execute the greenhouse system.
// {Args : 5000}
public class L25_GreenhouseController {
    public static void main(String[] args) {
        L25_GreenhouseControls gc = new L25_GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here;
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(200),
            gc.new LightOff(400),
            gc.new WaterOn(600),
            gc.new WaterOff(800),
            gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new L25_GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}
