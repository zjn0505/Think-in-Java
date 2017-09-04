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


    public MyCell[][] myCells = new MyCell[9][9];

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
                    s += "X";
                }
            }
            s += "\n";
        }
        System.out.println(s);
    }

    @Override
    public FireResult hit(Position p) {
        if (myCells[p.X-START_POS][p.Y-START_POS] == MyCell.EMPTY) {
            return FireResult.MISS;
        } else if (myCells[p.X-START_POS][p.Y-START_POS] == MyCell.PLANE_PART) {
            return FireResult.HIT;
        } else {
            return FireResult.DESTROYED;
        }
    }

    @Override
    public void broadcastResult() {

    }








    public boolean initBoardWithPlanes(Plane[] planes) {
        myCells = new MyCell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                myCells[i][j] = MyCell.EMPTY;
            }
        }
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
        Position head = plane.head;
        Position heart = plane.heart;
        int x = head.X;
        int y = head.Y;
        int orient = checkOrient(head, heart);
        if (ORI_INVALID == orient) {
            throw new BoardSetException("The plane set is invalid, plane position out of board.");
        }
        if (!isCellTaken(x, y)) {
            myCells[x-START_POS][y-START_POS] = MyCell.PLANE_HEAD;
        } else {
            throw new BoardSetException("The plane set is invalid, overlapped planes.");
        }
        if (ORI_N == orient) {
            addCellToBoard(x, y+1);
            addCellToBoard(x-2, y+1);
            addCellToBoard(x-1, y+1);
            addCellToBoard(x+1, y+1);
            addCellToBoard(x+2, y+1);
            addCellToBoard(x, y+2);
            addCellToBoard(x, y+3);
            addCellToBoard(x-1, y+3);
            addCellToBoard(x+1, y+3);
        } else if (ORI_E == orient) {
            addCellToBoard(x-1, y);
            addCellToBoard(x-1, y-2);
            addCellToBoard(x-1, y-1);
            addCellToBoard(x-1, y+1);
            addCellToBoard(x-1, y+2);
            addCellToBoard(x-2, y);
            addCellToBoard(x-3, y);
            addCellToBoard(x-3, y-1);
            addCellToBoard(x-3, y+1);
        } else if (ORI_S == orient) {
            addCellToBoard(x, y-1);
            addCellToBoard(x-2, y-1);
            addCellToBoard(x-1, y-1);
            addCellToBoard(x+1, y-1);
            addCellToBoard(x+2, y-1);
            addCellToBoard(x, y-2);
            addCellToBoard(x, y-3);
            addCellToBoard(x-1, y-3);
            addCellToBoard(x+1, y-3);
        } else if (ORI_W == orient) {
            addCellToBoard(x+1, y);
            addCellToBoard(x+1, y-2);
            addCellToBoard(x+1, y-1);
            addCellToBoard(x+1, y+1);
            addCellToBoard(x+1, y+2);
            addCellToBoard(x+2, y);
            addCellToBoard(x+3, y);
            addCellToBoard(x+3, y-1);
            addCellToBoard(x+3, y+1);
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
        if (head.X == heart.X && head.X >= START_POS+2 && head.X <= 9 - (3-START_POS)) {
            if (head.Y < heart.Y && head.Y >= START_POS && head.Y <= 9 - (4-START_POS)) {
                orient = ORI_N;
            } else if (head.Y > heart.Y && head.Y >= (5-START_POS) && head.Y <= 9 - (1-START_POS)) {
                orient = ORI_S;
            }
        } else if (head.Y == heart.Y && head.Y >= START_POS + 2 && head.Y <= 9 - (3 - START_POS)) {
            if (head.X < heart.X && head.X >= START_POS && head.X <= 9 - (4-START_POS)) {
                orient = ORI_W;
            } else if (head.X > heart.X && head.X >= (5-START_POS) && head.X <= 9 - (1-START_POS)) {
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
