package ch14_generics.Lesson;

import java.util.List;

/**
 * Created by jienanzhang on 13/05/2017.
 */
public class L36_SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        //! apples.add(new Fruit()); // Error
    }
}
