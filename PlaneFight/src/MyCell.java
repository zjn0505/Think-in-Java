/**
 * Created by Jienan on 2017/9/4.
 */
public enum MyCell {
    EMPTY(0),
    PLANE_PART(1),
    PLANE_HEAD(2),
    PLANE_BROKEN(3);

    private int mValue;

    private MyCell(int value) {
        mValue = value;
    }
}
