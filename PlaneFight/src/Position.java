/**
 * Created by Jienan on 2017/9/4.
 */
public class Position {
    public int row;
    public int col;
    public boolean hit = false;

    public static Position getPosition(int rowCol) {
        try {
            return new Position(rowCol);
        } catch (InvalidPositionException e) {
            return null;
        }
    }

    public Position(int rowCol) throws InvalidPositionException {
        boolean isValid = false;
        if (rowCol < 100 && rowCol > 10) {
            int row = rowCol / 10;
            int col = rowCol % 10;
            if (row != 0 && col != 0) {
                this.row = row;
                this.col = col;
                if (isValid(row) && isValid(col)) {
                    isValid = true;
                }
            }
        }
        if (!isValid) {
            throw new InvalidPositionException();
        }
    }

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
        return String.format("%d%d", row, col);
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

    public class InvalidPositionException extends BoardException {
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
