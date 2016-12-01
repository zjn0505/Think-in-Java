package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 6/25/16.
 */
//{CompileTimeError}
/****************** Exercise 6 *****************
 * If you don’t call the base-class constructor
 * in BoardGame(), the compiler will respond
 * that it can’t find a constructor of the form
 * Game(). The call to the base-class
 * constructor must be the first thing you do
 * in the derived-class constructor. (The compiler
 * will remind you if you get it wrong.)
 * Use Chess.java to prove those assertions.
 ***********************************************/
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
/*
class ChessWithoutDefCtor extends BoardGame {
//    ChessWithoutDefCtor () {
//      System.out.println("ChessWithoutDefCtor constructor");
//      super(11);
//    }
}

public class E06_ChessWithoutDefCtor {
    public static void main(String[] args) {
        new ChessWithoutDefCtor();
    }
}
*/
