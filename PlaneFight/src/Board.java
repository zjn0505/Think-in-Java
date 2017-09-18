/**
 * Created by Jienan on 2017/9/4.
 */
public class Board {

    public Plane[] planes = new Plane[3];

    public MyCell[][] myCells = new MyCell[9][9];
    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                myCells[i][j] = MyCell.EMPTY;
            }
        }
    }
    public boolean addPlane(Plane plane) {
        for (int i = 0; i < plane.body.size(); i++) {
            Position p = plane.body.get(i);
            if (myCells[p.row-1][p.col-1] != MyCell.EMPTY) {
                return false;
            }
            if (i == 0) {
                myCells[p.row-1][p.col-1] = MyCell.PLANE_HEAD;
            } else {
                myCells[p.row - 1][p.col - 1] = MyCell.PLANE_PART;
            }
        }
        return true;
    }

    public class BoardSetException extends BoardException {

        public BoardSetException(String message) {
            super(message);
        }
    }
}
