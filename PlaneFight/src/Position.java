/**
 * Created by Jienan on 2017/9/4.
 */
public class Position {
    public int row;
    public int col;
    public boolean hit = false;

    public Position(int row, int col) throws InvalidPositionException {
        this.row = row;
        this.col = col;
        if (!isValid(row) || !isValid(col)) {
            throw new InvalidPositionException();
        }
    }

    public Position add(Vector vector) throws InvalidPositionException {
        return new Position(row + vector.row, col + vector.col);
    }

    @Override
    public String toString() {
        String s = String.format("R%dC%d", row, col);
        return s;
    }

    public int[] checkDistance(Position p) {
        return new int[]{p.row - row, p.col - col};
    }

    public boolean isCloseTo(Position p) {
        boolean isCloseTo = false;
        int[] vector = checkDistance(p);
        if (vector[0] == 1 && vector[1] == 0) {
            isCloseTo = true;
        } else if (vector[0] == -1 && vector[1] == 0) {
            isCloseTo = true;
        } else if (vector[0] == 0 && vector[1] == 1) {
            isCloseTo = true;
        } else if (vector[0] == 0 && vector[1] == -1) {
            isCloseTo = true;
        }
        return isCloseTo;
    }

    private boolean isValid(int n) {
        return (n > 0 && n < 10);
    }

    public class InvalidPositionException extends Exception {
        InvalidPositionException() {
            super(String.format("Invalid position of Row : %d, Column : %d !", row, col));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) {
            return false;
        }
        Position p = (Position) obj;
        if (p.row == this.row && p.col == this.col) {
            return true;
        } else {
            return false;
        }
    }
}
