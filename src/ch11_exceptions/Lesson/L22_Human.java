package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/15.
 */
// Catching exception hierarchies.
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class L22_Human {
    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance e) {
            System.out.println("Caght Annoyance");
        }

        // Catch the base type:
        try {
            throw new Sneeze();
        } catch (Annoyance e) {
            System.out.println("Caght Annoyance");
        }
    }
}
