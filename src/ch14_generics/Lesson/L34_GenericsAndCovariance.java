package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 10/05/2017.
 */
public class L34_GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        //! flist.add(new Fruit());
        //! flist.add(new Apple());
        //! flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);
    }
}
