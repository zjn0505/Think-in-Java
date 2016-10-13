package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/10/13.
 */
// Dynamically changing the behavior of an object
// via composition (the "State" design pattern).

class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor();};
    public void performPlay() {
        actor.act();
    }
}

public class L11_Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }

}
