package ch12_strings.Exercise;

/**
 * Created by Jienan on 2017/3/21.
 */

import java.util.Arrays;

/************************** Exercise 14 ******************
 * Rewrite SplitDemo using String.split().
 *********************************************************/
public class E14_SplitDemo2 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
