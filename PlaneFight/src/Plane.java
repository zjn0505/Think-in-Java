import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jienan on 2017/9/4.
 */
public class Plane {
    public Position head;
    public Position heart;
    public List<Position> body = new ArrayList<Position>(10);
    public Vector vectorLeft;
    public Vector vectorRight;
    public Vector vectorEnd;
    public boolean destroyed = false;

    public static Plane build(String hhString) {
        int head = Integer.valueOf(hhString.split("\\|")[0]);
        int heart = Integer.valueOf(hhString.split("\\|")[1]);
        Plane p;
        try {
            p = new Plane(head, heart);
        } catch (BoardException e) {
            e.printStackTrace();
            return null;
        }
        return p;
    }

    public static Plane build(int headRow, int headCol, int heartRow, int heartCol) {

        Plane p;
        try {
            p = new Plane(new Position(headRow, headCol), new Position(heartRow, heartCol));
        } catch (BoardException e) {
//            e.printStackTrace();
            return null;
        }
        return p;
    }

    /**
     *
     * @param hhString 98|97
     */
    public Plane(String hhString) throws BoardException {
        this(Integer.valueOf(hhString.split("\\|")[0]), Integer.valueOf(hhString.split("\\|")[1]));

    }

    public Plane(int rowColHead, int rowColHeart) throws BoardException {
        this(new Position(rowColHead), new Position(rowColHeart));
    }

    public Plane(int headRow, int headCol, int heartRow, int heartCol) throws BoardException {
            this(new Position(headRow, headCol), new Position(heartRow, heartCol));
    }

    /**
             head
     L1  L2  heart  R2  R1
              c3
          L3  c4   L3

       <-- VectorLeft
        |   VectorEnd
       \|/
    **/
    public Plane(Position head, Position heart) throws BoardException {
        this.head = head;
        this.heart = heart;

        if (!head.isCloseTo(heart)) {
            throw new InvalidPlaneException();
        }
        try {
            vectorEnd = new Vector(heart.row - head.row, heart.col - head.col);
            vectorLeft = new Vector(heart.col - head.col, head.row - heart.row);
            vectorRight = new Vector(head.col - heart.col,  heart.row - head.row);
            Position C3 = heart.add(vectorEnd);
            Position C4 = heart.add(vectorEnd).add(vectorEnd);
            Position L3 = C4.add(vectorLeft);
            Position R3 = C4.add(vectorRight);
            Position L2 = heart.add(vectorLeft);
            Position L1 = L2.add(vectorLeft);
            Position R2 = heart.add(vectorRight);
            Position R1 = R2.add(vectorRight);
            addPlanePart(head);
            addPlanePart(L1);
            addPlanePart(L2);
            addPlanePart(heart);
            addPlanePart(R2);
            addPlanePart(R1);
            addPlanePart(C3);
            addPlanePart(L3);
            addPlanePart(C4);
            addPlanePart(R3);
        } catch (Position.InvalidPositionException e) {
//            e.printStackTrace();
            throw new InvalidPlaneException();
        }
    }

    private void addPlanePart(Position p) throws InvalidPlaneException {
        if (body.contains(p)) {
            throw new InvalidPlaneException();
        } else {
            body.add(p);
        }
    }

    public void printBodyList() {
        for (Position p : body) {
            System.out.print(p.row + "" + p.col + " ");
        }
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
        sb.append(head.row);
        sb.append(head.col);
        sb.append("|");
        sb.append(heart.row);
        sb.append(heart.col);
        return sb.toString();
    }

    public static void main(String[] args) {
        Plane p = null;
        try {
//            p =  new Plane(3, 8, 3, 7);
            p = new Plane(9, 7, 8, 7);
        } catch (BoardException e) {
            e.printStackTrace();
        }
        p.printBodyList();
    }
    
    public class InvalidPlaneException extends BoardException {
        InvalidPlaneException() {
            super("Invalid plane with head : " + head.toString() + " and heart : " + heart.toString());
        }
    }
}
