package ch14_generics.Lesson;

import ch14_generics.Lesson.L13_watercolors.Watercolors;
import static ch14_generics.Lesson.L13_watercolors.Watercolors.*;
import static net.mindview.util.Sets.*;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Jienan on 2017/4/26.
 */
public class L13_WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 =
                EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 =
                EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("difference(set1, subset): " + difference(set1, subset));
        System.out.println("difference(set2, subset): " + difference(set2, subset));
        System.out.println("complement(set1, set2): " + complement(set1, set2));
    }
}
