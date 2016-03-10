package ch03_Control;

/**
 * For Loops with "labeled break" and "labeled continue".
 * Created by Jienan on 2016/3/10.
 */
public class L02_LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; true ;) {
            System.out.println("here in outer start");
            inner:
            for (; i < 10; i++) {
                System.out.println("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
            System.out.println("here in outer end ...");
        }
    }

}
