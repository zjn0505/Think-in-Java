import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import javafx.geometry.Pos;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jienan on 2017/9/4.
 */
public class ComputeBoard {

//    static ArrayList<Plane> planes = new ArrayList<>();
//    static MyBoard = new MyBoard();

    static MyBoard myBoard;

    public static void main(String[] args) {
        myBoard = new MyBoard();
        try{
            PrintWriter writer = new PrintWriter("BoardStatus.txt", "UTF-8");

            ArrayList<String> hitProfile = new ArrayList<String>();
            ArrayList<String> missProfile = new ArrayList<String>();
//            missProfile.add("44");
//            missProfile.add("34");
//            hitProfile.add("54");
//            missProfile.add("43");
//            missProfile.add("61");
//            hitProfile.add("83");
//            hitProfile.add("66");
//            hitProfile.add("93");
//            hitProfile.add("67");
//            hitProfile.add("57");
//            hitProfile.add("76");
//            hitProfile.add("83");
//            hitProfile.add("86");
//            hitProfile.add("96");
//            hitProfile.add("47");
//            hitProfile.add("37");
//            hitProfile.add("73");
//            hitProfile.add("63");
//            hitProfile.add("74");
//            hitProfile.add("75");
//            hitProfile.add("77");
//            hitProfile.add("78");
//            hitProfile.add("96");
//            hitProfile.add("97");

            ArrayList<Plane> planeList = createPlaneList(missProfile);
            ArrayList<Board> boardList = createBoardList(planeList, hitProfile);
            for (Board board : boardList) {
                Plane[] planes = board.planes;
                Plane p1 = planes[0];
                Plane p2 = planes[1];
                Plane p3 = planes[2];
                String s = p1.toString()+","+p2.toString()+","+ p3.toString();
                System.out.println(s);
                writer.write(s+"\n");
            }

            System.out.println("Available planes count : " + planeList.size());
            System.out.println("Available boards count : " + boardList.size());
            ArrayList<Integer> predictHeadList = predictHeadList(boardList);
            for (int i = 0; i < 81; i++) {
                if (i % 9 == 0) {
                    System.out.println();
                }
                System.out.print(String.format("%3d ", predictHeadList.get(i)));
            }
            System.out.println();
            writer.close();

        } catch (IOException e) {
            // do something
        }
    }


    /**
     * Step 1 create a list of planes that can be place on the map.
     * missProfile is cells that have been hit, thus planes with
     * parts in this profile should be remove from the list.
     * @param missProfile
     * @return
     */
    public static ArrayList<Plane> createPlaneList(@Nullable ArrayList<String> missProfile) {
        ArrayList<Plane> planes = new ArrayList<Plane>();
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
                String head = i + "" + j;
                if (missProfile != null && missProfile.contains(head))
                    continue;
                createPlaneWithHead(planes, i,j, missProfile);

            }
        }

        return planes;
    }


    private static void createPlaneWithHead(ArrayList<Plane> planes, int i, int j, @Nullable ArrayList<String> missProfile) {
        Plane pN = createPlaneWithHeadAndHeart(i, j, i, j - 1, missProfile);
        Plane pE = createPlaneWithHeadAndHeart(i, j, i + 1, j, missProfile);
        Plane pS = createPlaneWithHeadAndHeart(i, j, i, j + 1, missProfile);
        Plane pW = createPlaneWithHeadAndHeart(i, j, i - 1, j, missProfile);
        if (pN != null) planes.add(pN);
        if (pE != null) planes.add(pE);
        if (pS != null) planes.add(pS);
        if (pW != null) planes.add(pW);
    }

    @Nullable
    private static Plane createPlaneWithHeadAndHeart(int i, int j, int i2, int j2, @Nullable ArrayList<String> missProfile) {
        Plane plane = Plane.build(i, j, i2, j2);
        if (plane != null && missProfile != null) {
            for (Position p : plane.body) {
                if (missProfile.contains(p.toString())) {
                    return null;
                }
            }

        }
        return plane;
    }

    /**
     * Step 2
     * @param planes
     * @param hitProfile
     * @return
     */
    public static ArrayList<Board> createBoardList(@NotNull ArrayList<Plane> planes, @Nullable ArrayList<String> hitProfile) {
        ArrayList<Board> boards = new ArrayList<Board>();
        int possiblePlanesCount = planes.size();
        for (int i = 0; i < possiblePlanesCount - 2; i++) {
            for (int j = i+1; j < possiblePlanesCount - 1; j++) {
                for (int k = j+1; k < possiblePlanesCount; k++) {
                    Plane p1 = planes.get(i);
                    Plane p2 = planes.get(j);
                    Plane p3 = planes.get(k);
                    Plane[] pArray = {p1, p2, p3};
                    Board board = MyBoard.getBoard(pArray);
                    if (i == 23 && j == 52 && k == 53) {
                        System.out.println("here");
                    }
                    if (board != null) {
                        boolean isValid = true;
                        if (hitProfile != null && hitProfile.size() > 0) {
                            for (String s : hitProfile) {
                                int row = Integer.valueOf(s.substring(0,1));
                                int col = Integer.valueOf(s.substring(1,2));
                                if (board.myCells[row-1][col-1] != MyCell.PLANE_PART && board.myCells[row-1][col-1] != MyCell.PLANE_HEAD) {
                                    isValid = false;
                                    break;
                                }
                            }

                        }
                        if (isValid)
                            boards.add(board);
                    }
                }
            }
        }

        return boards;
    }

    /**
     * Step 3
     * @param boardList
     * @return
     */
    public static ArrayList<Integer> predictHeadList(ArrayList<Board> boardList) {
        Integer[] predict = new Integer[81];
        for (int i = 0; i < 81; i++) {
            predict[i] = 0;
        }
        for (Board b : boardList) {
            for (Plane p : b.planes) {
                int row = p.head.row;
                int col = p.head.col;
                int index = ((row - 1) * 9 + col -1);
                predict[index]++;
            }
        }
        return new ArrayList(Arrays.asList(predict));
    }
}
