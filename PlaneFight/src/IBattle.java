/**
 * Created by Jienan on 2017/9/4.
 */
public interface IBattle {
    FireResult hit(Position p);
    void broadcastResult();
}
