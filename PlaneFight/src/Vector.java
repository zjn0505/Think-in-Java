/**
 * Created by Jienan on 2017/9/12.
 */
public class Vector {
    public int row;
    public int col;

    public Vector(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        String s = String.format("R%dC%d", row, col);
        return s;
    }
}
