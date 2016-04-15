package ch04_Initialization.Exercise;

/**
 * Assign a string to each element of an array of
 * String objects. Print the array using a for loop.
 * Created by Jienan on 2016/3/31.
 */
public class E16_StringArray {
    public static void main(String[] args) {
        String[] sal1 = new String[4];
        sal1[0] = "There";
        sal1[1] = "are";
        sal1[2] = "some";
        sal1[3] = "strings";
        for (int i = 0; i < sal1.length; i++)
            System.out.println(sal1[i]);
        String sal2[] = {
                "There", "are", "some", "strings",
        };
        for (int i = 0; i < sal2.length; i++)
            System.out.println(sal2[i]);
    }

}
