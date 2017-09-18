import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jienan on 2017/9/12.
 */
class PositionTest {

    private static Position p;

    @BeforeEach
    void setUp() throws Position.InvalidPositionException {
        p = new Position(1, 2);
    }

    @org.junit.jupiter.api.Test
    void add() {
        Position p1 = null;
        Position p1t = null;
        try {
            p1 = p.add(new Vector(-2, 1));
            p1t = new Position(3, 3);
            fail("Exception caught");
        } catch (Position.InvalidPositionException e) {
            e.printStackTrace();
            String expectedMessage = "Invalid position of Row : -1, Column : 3 !";
            assertEquals( expectedMessage, e.getMessage() );
        }

        Position p2 = null;
        Position p2t = null;
        try {
            p2 = p.add(new Vector(2, 1));
            p2t = new Position(3, 3);
        } catch (Position.InvalidPositionException e) {
            e.printStackTrace();
        }
        assertEquals(p2, p2t);

    }

    @org.junit.jupiter.api.Test
    void checkDistance() {

    }

    @org.junit.jupiter.api.Test
    void isCloseTo() {

    }

}