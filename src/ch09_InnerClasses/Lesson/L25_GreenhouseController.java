package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Lesson.L25_controller.Event;

/**
 * Created by jienanzhang on 12/1/16.
 */
public class L25_GreenhouseController {
    public static void main(String[] args) {
        L25_GreenhouseControls gc = new L25_GreenhouseControls();
        gc.addEvent(gc.new Bell(9000));
        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(2000),
            gc.new LightOff(4000),
            gc.new WaterOn(6000),
            gc.new WaterOff(8000),
            gc.new ThermostatDay(14000)
        };
        gc.addEvent(gc.new Restart(20000, eventList));
        if (args.length == 1)
            gc.addEvent(new L25_GreenhouseControls.Terminate(new Integer(args[0])));
        gc.run();
    }
}
