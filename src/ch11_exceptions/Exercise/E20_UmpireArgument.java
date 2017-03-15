package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/15.
 */
/****************** Exercise 20 *****************
 * Modify StormyInning.java by adding an
 * UmpireArgument exception type and methods
 * that throw this exception. Test the modified
 * hierarchy.
 ***********************************************/
class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul, UmpireArgument;
    abstract void decision() throws UmpireArgument;
    public void walk() {} // Throws no checked exception
}

class StormExeption extends Exception {}
class RainedOut extends StormExeption {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // mast deal with the base constructor exceptions
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws RainedOut, BaseballException {}
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
    public void atBat() throws PopFoul, UmpireArgument {
        throw new UmpireArgument();
    }
    void decision() throws UmpireArgument {
        throw new UmpireArgument();
    }
}
public class E20_UmpireArgument {
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        // Or you can add code to catch the
        // specific type of exception:
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.decision();
        } catch (PopFoul popFoul) {
            popFoul.printStackTrace();
        } catch (UmpireArgument umpireArgument) {
            umpireArgument.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        } catch (RainedOut rainedOut) {
            rainedOut.printStackTrace();
        }
    }
}
