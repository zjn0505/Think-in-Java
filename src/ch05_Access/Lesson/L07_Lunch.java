package ch05_Access.Lesson;

/**
 * Created by Jienan on 2016/4/28.
 * Demonstrates class access specifiers. Make a class
 * effectively private with private constructors
 */
class Soup1 {
    private Soup1() {}
    // (1) Allow creation via static method:
    // Useful if want to do some extra operations
    // or keep count of how many Soup1 objects to create
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    // (2) Create a static object and return a reference
    // upon request. (The "Singleton" pattern):
    // There is one and only one Soup2
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

// Only one public class allowed per file:
public class L07_Lunch {
    void testPrivate() {
        //! Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access().f();
    }

}
