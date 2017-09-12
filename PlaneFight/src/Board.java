/**
 * Created by Jienan on 2017/9/4.
 */
public class Board {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 2};
        System.out.println(a.equals(b));
    }
    public MyCell[][] myCells = new MyCell[9][9];
    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                myCells[i][j] = MyCell.EMPTY;
            }
        }
    }
}
