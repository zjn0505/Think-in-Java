import javafx.geometry.Pos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Jienan on 2017/9/4.
 */
public class ComputeBoard {

    static ArrayList<Plane> planes = new ArrayList<>();
//    static MyBoard = new MyBoard();

    static MyBoard myBoard;

    public static void main(String[] args) {
        myBoard = new MyBoard();
        try{
            PrintWriter writer = new PrintWriter("BoardStatus.txt", "UTF-8");
            computeBoard();

            for (Plane p1: planes) {
                for (Plane p2: planes) {
                    for (Plane p3: planes) {


                        Plane[] pA = {p1, p2, p3};
                        if (p1.equals("31|32") && p2.equals("17|27")&&p3.equals("56|55")) {
                            System.out.println("a");
                        }
                        if (myBoard.initBoardWithPlanes(pA)) {
                            writer.write(p1.toString()+","+p2.toString()+","+ p3.toString()+"\n");

                        }
                    }
                }
            }


            writer.close();

        } catch (IOException e) {
            // do something
        }
    }

    private static void computeBoard() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i < 3 && j < 3)
                    continue;
                if (i < 3 && j > 7)
                    continue;
                if (i > 7 && j < 3)
                    continue;
                if (i > 7 && j > 7)
                    continue;
                createPlaneWithHead(i,j);
            }
        }
        System.out.println(planes.size() + "   ");
    }

    private static void createPlaneWithHead(int i, int j) {
        Position head = new Position(i, j);
        Position heartN = new Position(i, j-1);
        Position heartE = new Position(i+1, j);
        Position heartS = new Position(i, j+1);
        Position heartW = new Position(i-1, j);

        if (myBoard.checkOrient(head, heartN) != 0) {
            planes.add(new Plane(head, heartN));
        }
        if (myBoard.checkOrient(head, heartE) != 0) {
            planes.add(new Plane(head, heartE));
        }
        if (myBoard.checkOrient(head, heartS) != 0) {
            planes.add(new Plane(head, heartS));
        }
        if (myBoard.checkOrient(head, heartW) != 0) {
            planes.add(new Plane(head, heartW));
        }
    }
}
