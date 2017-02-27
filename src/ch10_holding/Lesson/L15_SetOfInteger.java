package ch10_holding.Lesson;

import java.util.*;

/**
 * Created by Jienan on 2017/2/27.
 */
public class L15_SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
        // This HashSet has order in JDK8 inadvertently.

        intset.clear();

        for (int i=0;i<10000;i++){
            intset.add(rand.nextInt(30) + (1 << 16));
        }
        Iterator<Integer> iterator=intset.iterator();
        while (iterator.hasNext()){
            System.out.print((iterator.next() - (1 << 16)) +" ");
        }


    }
}
