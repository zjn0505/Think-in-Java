import java.util.Scanner;

/**
 * Created by Jienan on 2017/9/4.
 */
public class Game {

    MyBoard board;
    public static void main(String[] args) {
        Game game = new Game();
//        game.board = new MyBoard();
//        Plane p1 = new Plane(3,1, 3, 2);
//        Plane p2 = new Plane(1,7, 2, 7);
//        Plane p3 = new Plane(5, 6, 5 , 5);
//        game.board.resetBoards(new Plane[]{p1, p2, p3});
//
//        game.play();


    }

    private void play() {
        boolean shouldContinue = true;
        Scanner reader = new Scanner(System.in);
        int destroyed = 0;
        while (shouldContinue) {
            System.out.println("Enter coordinate:");
            int n = reader.nextInt();
            int x = n / 10;
            int y = n % 10;
//            FireResult result = board.hit(new Position(x, y));
//            System.out.println(result);
//            if (result == FireResult.DESTROYED) {
//                destroyed++;
//                if (destroyed == 3) {
//                    shouldContinue = false;
//                    System.out.println("You win!");
//                }
//            }
        }
    }
}
