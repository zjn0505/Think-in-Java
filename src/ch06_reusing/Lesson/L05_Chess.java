package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 6/25/16.
 * Inheritance. constructors and arguments.
 */

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class L05_Chess extends BoardGame {
    L05_Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new L05_Chess();
    }
}
