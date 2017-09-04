/**
 * Created by Jienan on 2017/9/4.
 */
public class Cell {
    public Position position;

    public enum BoardState {
        EMPTY(0),
        PLANE_PART(1),
        PLANE_HEAD(2);

        private int mValue;

        private BoardState(int value) {
            mValue = value;
        }
    }
}
