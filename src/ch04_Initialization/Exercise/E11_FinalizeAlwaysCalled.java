package ch04_Initialization.Exercise;

/**
 * Created by Jienan on 2016/3/16.
 */
public class E11_FinalizeAlwaysCalled {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized() called");
    }

    public static void main(String[] args) {
        new E11_FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
}
