/**
 * Created by Jienan on 2017/9/4.
 */
public class Plane {
    public Position head;
    public Position heart;

    public Plane(int x1, int y1, int x2, int y2) {
        head = new Position(x1, y1);
        heart = new Position(x2, y2);
    }

    public Plane(Position head, Position heart) {
        this.head = head;
        this.heart = heart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            if (s.equals(toString())) {
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(head.X);
        sb.append(head.Y);
        sb.append("|");
        sb.append(heart.X);
        sb.append(heart.Y);
        return sb.toString();
    }
}
