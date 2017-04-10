package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/10.
 */

import ch14_generics.Lesson.L04_RandomList;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

/****************** Exercise 6 *****************
 * Use RandomList with two more types in addition
 * to the one shown in main().
 ************************************************/
public class E06_RandomListTest {
    private static void dump(L04_RandomList<?> rl) {
        for (int i = 0; i < 11; i++)
            System.out.print(rl.select() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        L04_RandomList<String> rs = new L04_RandomList<String>();
        for (String s : ("The quick brown forx jumped over the lazy brown dog").split(" "))
            rs.add(s);
        dump(rs);
        L04_RandomList<Integer> ri = new L04_RandomList<Integer>();
        Generator<Integer> gi = new CountingGenerator.Integer();
        for (int i = 0; i < 11; i++)
            ri.add(gi.next());
        dump(ri);
        L04_RandomList<Character> rc = new L04_RandomList<Character>();
        Generator<Character> gc = new CountingGenerator.Character();
        for (int i = 0; i < 11; i++)
            rc.add(gc.next());
        dump(rc);
    }
}
