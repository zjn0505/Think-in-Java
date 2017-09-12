import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jienan on 2017/9/4.
 */
public class Plane {
    public Position head;
    public Position heart;
    public List<Position> body = new ArrayList<>(10);
    public Vector vectorLeft;
    public Vector vectorRight;
    public Vector vectorEnd;


    /*
                 head
         L1  L2  heart  R2  R1
                  c3
              L3  c4   L3

           <-- VectorLeft
            |   VectorEnd
           \|/
     */

    public Plane(int headRow, int headCol, int heartRow, int heartCol) throws InvalidPlaneException, Position.InvalidPositionException {
            this(new Position(headRow, headCol), new Position(heartRow, heartCol));
    }

    public Plane(Position head, Position heart) throws InvalidPlaneException {
        this.head = head;
        this.heart = heart;

        if (!head.isCloseTo(heart)) {
            throw new InvalidPlaneException();
        }
        try {
            vectorEnd = new Vector(heart.row - head.row, heart.col - head.col);
            vectorLeft = new Vector(heart.col - head.col, head.row - heart.row);
            vectorRight = new Vector(heart.col - head.col,  heart.row - head.row);
            Position C3 = heart.add(vectorEnd);
            Position C4 = heart.add(vectorEnd).add(vectorEnd);
            Position L3 = C4.add(vectorLeft);
            Position R3 = C4.add(vectorRight);
            Position L2 = heart.add(vectorLeft);
            Position L1 = L2.add(vectorLeft);
            Position R2 = heart.add(vectorRight);
            Position R1 = R2.add(vectorRight);
            body.add(head);
            body.add(L1);
            body.add(L2);
            body.add(heart);
            body.add(R2);
            body.add(R1);
            body.add(C3);
            body.add(L3);
            body.add(C4);
            body.add(R3);
        } catch (Position.InvalidPositionException e) {
            e.printStackTrace();
            throw new InvalidPlaneException();
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
            p = new Plane(9,7, 8,7);
        } catch (InvalidPlaneException e) {
            e.printStackTrace();
        } catch (Position.InvalidPositionException e) {
            e.printStackTrace();
        }
        p.printBodyList();
    }
    
    public class InvalidPlaneException extends Exception {
        InvalidPlaneException() {
            super("Invalid plane with head : " + head.toString() + " and heart : " + heart.toString());
        }
    }
}
