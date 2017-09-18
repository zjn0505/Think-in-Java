/**
 * Created by Jienan on 2017/9/4.
 */
public class MyBoard extends Board implements IBattle{

    private final static int START_POS = 1;

    public static void main(String[] args) {
        MyBoard board = new MyBoard();
        try {
            Plane p1 = new Plane(9, 7, 8, 7);
            Plane p2 = new Plane(8, 3, 7, 3);
            Plane p3 = new Plane(3, 8, 3, 7);
            board.resetBoards(new Plane[] {p1, p2, p3});
        } catch (BoardException e) {
            e.printStackTrace();
        }
        board.printBoard();
    }

    public void resetBoards(Plane[] planes) {
        if (!initBoardWithPlanes(planes)) {
            System.out.println("Init failed");
        }
    }

    public void printBoard() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                s += " ABCDEFGHI\n";
                continue;
            }
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    s+= String.valueOf(i);
                    continue;
                }
                MyCell state = myCells[i-1][j-1];
                if (state == MyCell.EMPTY) {
                    s += " ";
                } else if (state == MyCell.PLANE_HEAD) {
                    s += "H";
                } else if (state == MyCell.PLANE_PART) {
                    s += "O";
                }
            }
            s += "\n";
        }
        System.out.println(s);
    }

    @Override
    public FireResult hit(Position p) {
        if (myCells[p.row-START_POS][p.col-START_POS] == MyCell.EMPTY) {
            return FireResult.MISS;
        } else if (myCells[p.row-START_POS][p.col-START_POS] == MyCell.PLANE_PART) {
            return FireResult.HIT;
        } else {
            return FireResult.DESTROYED;
        }
    }

    @Override
    public void broadcastResult() {

    }

    public boolean initBoardWithPlanes(Plane[] planesParams) {
        planes = new Plane[3];
        try {
            if (planesParams.length != 3) {
                throw new BoardSetException("Should start with 3 planes");
            }
            for (int i = 0; i < 3; i++) {
                planes[i] = planesParams[i];
                if (!addPlane(planes[i])) return false;
            }
        } catch (BoardException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static Board getBoard(Plane[] planesParams) {
        MyBoard myBoard = new MyBoard();
        if (myBoard.initBoardWithPlanes(planesParams))
            return myBoard;
        return null;
    }

}
