package ch06_reusing.Exercise;

import javax.xml.transform.dom.DOMResult;

/**
 * Created by jienanzhang on 8/13/16.
 */
class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

class ServicableEngine extends Engine {
    public void service() {}
}

class ServicableCar {
    public ServicableEngine engine = new ServicableEngine();
    public Wheel[] wheel = new Wheel[4];
    public Door
        left = new Door(),
        right = new Door();
    public ServicableCar() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
}

public class E14_ServicableEngine {
    public static void main(String[] args) {
        ServicableCar car = new ServicableCar();
        car.left.window.rolldown();
        car.wheel[1].inflate(200);
        car.engine.service();
    }
}
