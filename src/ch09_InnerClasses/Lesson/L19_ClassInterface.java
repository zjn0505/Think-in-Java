package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/11/14.
 */
public interface L19_ClassInterface {
    void howdy();
    class Test implements L19_ClassInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
