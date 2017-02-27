package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/24.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************** Exercise 7 *****************
 * Create a class and make an initialized array
 * of your class objects. Fill a List from
 * your array. Create a subset of your List using
 * subList(), then remove this subset from
 * your List.
 ***********************************************/
class IDClass {
    private static int counter;
    private int count = counter++;
    public String toString() {
        return "IDClass " + count;
    }
}
public class E07_TestList {
    public static void main(String[] args) {
        IDClass[] idc = new IDClass[10];
        for (int i = 0; i < idc.length; i++)
            idc[i] = new IDClass();
        List<IDClass> lst = new ArrayList<IDClass>(
                Arrays.asList(idc)
        );
        System.out.println("lst = " + lst);
        List<IDClass> subSet =
                lst.subList(lst.size()/4, lst.size()/2);
        System.out.println("subSet = " + subSet);
        // The semantics of the sub list become undefined if the
        // backing list is structurally modified!

        // subSet is bond to lst, thus modification to lst will change
        // subSet simultaneously

//        subSet.clear();
        lst.remove(0);
        System.out.println(subSet);
//        lst.removeAll(new ArrayList<>(subSet));
        System.out.println("lst = " + lst);


    }
}
