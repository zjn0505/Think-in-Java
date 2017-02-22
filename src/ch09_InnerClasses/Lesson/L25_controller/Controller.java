package ch09_InnerClasses.Lesson.L25_controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 12/1/16.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event event) {
        eventList.add(event);
    }
    public void run() {
        while (eventList.size() > 0) {
            // Make a copy so you are not modifying the list
            // while you are selecting the elements in it
            for (Event event : new ArrayList<Event>(eventList)) {
                if (event.ready()) {
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }

}
