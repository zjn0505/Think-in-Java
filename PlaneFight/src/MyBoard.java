/**
 * Created by Jienan on 2017/9/4.
 */
public class MyBoard extends Board implements IBattle{

    private final static int START_POS = 1;

    private final static int ORI_INVALID = 0;
    private final static int ORI_N = 1;
    private final static int ORI_E = 2;
    private final static int ORI_S = 3;
    private final static int ORI_W = 4;

    public static void main(String[] args) {
        MyBoard board = new MyBoard();
        try {
            board.addPlaneToBoard(new Plane(9, 7, 8, 7));
        } catch (BoardSetException e) {
            e.printStackTrace();
        } catch (Plane.InvalidPlaneException e) {
            e.printStackTrace();
        } catch (Position.InvalidPositionException e) {
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
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                MyCell state = myCells[j][i];
                if (state == MyCell.EMPTY) {
                    s += " ";
                } else if (state == MyCell.PLANE_HEAD) {
                    s += "O";
                } else if (state == MyCell.PLANE_PART) {
                    s += "row";
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


    public boolean initBoardWithPlanes(Plane[] planes) {
        try {

            if (planes.length != 3) {
                throw new BoardSetException("Should start with 3 planes");
            }
            for (Plane plane : planes) {
                addPlaneToBoard(plane);
//                printBoard();
            }
        } catch (BoardSetException e) {
//            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void addPlaneToBoard(Plane plane) throws BoardSetException{
        for (Position position : plane.body) {
            addCellToBoard(position.row, position.col);
        }
    }

    private void addCellToBoard(int x, int y) throws BoardSetException{
        if (isCellTaken(x, y)) {
            throw new BoardSetException("The plane set is invalid, overlapped planes.");
        }
        myCells[x-START_POS][y-START_POS] = MyCell.PLANE_PART;
    }

    private boolean isCellTaken(int x, int y) {
        return myCells[x-START_POS][y-START_POS] != MyCell.EMPTY;
    }


    /**
     *  check the orient of plane and make sure the plane is in the board
         N
     W       E
         S
        N = 1;
        E = 2;
        S = 3;
        W = 4;
        invalid = 0;
     **/
    public int checkOrient(Position head, Position heart) {
        int orient = ORI_INVALID;
        if (head.row == heart.row && head.row >= START_POS+2 && head.row <= 9 - (3-START_POS)) {
            if (head.col < heart.col && head.col >= START_POS && head.col <= 9 - (4-START_POS)) {
                orient = ORI_N;
            } else if (head.col > heart.col && head.col >= (5-START_POS) && head.col <= 9 - (1-START_POS)) {
                orient = ORI_S;
            }
        } else if (head.col == heart.col && head.col >= START_POS + 2 && head.col <= 9 - (3 - START_POS)) {
            if (head.row < heart.row && head.row >= START_POS && head.row <= 9 - (4-START_POS)) {
                orient = ORI_W;
            } else if (head.row > heart.row && head.row >= (5-START_POS) && head.row <= 9 - (1-START_POS)) {
                orient = ORI_E;
            }
        }
        return orient;
    }

    private class BoardSetException extends Exception {

        public BoardSetException(String message) {
            super(message);
        }
    }
}
