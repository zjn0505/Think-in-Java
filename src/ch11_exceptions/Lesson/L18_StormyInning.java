package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/14.
 */

// Overridden methods may throw only the exceptions
// specified in their base-class version, or exceptions
// derived from the base-class exceptions.

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {} // Throws no checked exception
}

class StormExeption extends Exception {}
class RainedOut extends StormExeption {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class L18_StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // mast deal with the base constructor exceptions
    public L18_StormyInning() throws RainedOut, BaseballException {}
    public L18_StormyInning(String s) throws RainedOut, BaseballException {}
    // Regular methods must conform to base class:
//!    void walk() throws PopFoul {}
    //  Interface CANNOT add exceptions to existing
    // methods from the base class:
//!    public void event() throws RainedOut {}
    // If the method doesn't already exist in the
    // base class, the exception is OK;
    public void rainHard() throws RainedOut {}
    // You can choose to not throw exceptions,
    // even if the base fversion does:
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {}

    public static void main(String[] args) {
        try {
            L18_StormyInning si = new L18_StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }




}
