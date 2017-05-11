package ch14_generics.Lesson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jienanzhang on 11/05/2017.
 */

public class L34_CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist =
                Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}

// add() only knows ? extends Fruit, contains and indexOf know Object
