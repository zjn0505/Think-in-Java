package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/25.
 */

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static net.mindview.util.Tuple.tuple;

/****************** Exercise 15 *****************
 * "Notice that f() returns a parameterized
 * TwoTuple object, while f2() returns an
 * unparameterized TwoTuple object. The compiler
 * doesn’t warn about f2() in this case because the
 * return value is not being used in a parameterized
 * fashion; in a sense, it is being “upcast” to an
 * unparameterized TwoTuple. However, if you were to
 * try to capture the result of f2() into a
 * parameterized TwoTuple, the compiler would issue a
 * warning."
 *
 * Verify the previous statement.
 ***********************************************/
public class E15_TupleTest3 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println((TwoTuple<String, Integer>)f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
