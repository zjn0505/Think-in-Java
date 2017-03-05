package ch10_holding.Lesson;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by jienanzhang on 05/03/2017.
 */
// All collections work with foreach.

public class L28_ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,
                "Take the long way home".split(" "));
        for (String s : cs)
            System.out.print(" '" + s + "' ");
    }
}


