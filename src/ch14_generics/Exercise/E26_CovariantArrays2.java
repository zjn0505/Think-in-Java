package ch14_generics.Exercise;

/**
 * Created by jienanzhang on 10/05/2017.
 */
/****************** Exercise 26 *****************
 * Demonstrate array covariance using Numbers and
 * Integers.
 ************************************************/
public class E26_CovariantArrays2 {
    public static void main(String[] args) {
        Number[] nums = new Integer[10];
        nums[0] = Integer.valueOf(1); // OK
        // Runtime type is Integer[], not Float[] or Byte[]:
        try {
            // Compiler allows you to add Float:
            nums[1] = new Float(1.0); // ArraysStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // Compiler allows you to add Byte:
            nums[2] = Byte.valueOf((byte) 1);
            // Above line produces an ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
