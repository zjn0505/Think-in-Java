package ch14_generics.Exercise;

/**
 * Created by jienanzhang on 10/05/2017.
 */

import java.util.ArrayList;
import java.util.List;

/****************** Exercise 27 *****************
 * Show that covariance doesn’t work with Lists,
 * using Numbers and Integers, then introduce
 * wildcards.
 ************************************************/
public class E27_GenericsAndCovariance2 {
    public static void main(String[] args) {
        // Compile Error: incompatible types:
        // List<Number> nlist = new ArrayList<Integer>();
        // Wildcards allow covariance:
        List<? extends Number> nlist = new ArrayList<Integer>();
        // Compile Error: can't add any type of object:
        // nlist.add(new Integer(1))'
        // nlist.add(new Float(1.0));
        // nlist.add(new Object());
        nlist.add(null);
        Number n = nlist.get(0);
        System.out.println(n);


        List<? extends Number> nlist2 = new ArrayList<Number>();
        //! nlist2.add(new Integer(1));
        //! nlist2.add(1);
    }
}
