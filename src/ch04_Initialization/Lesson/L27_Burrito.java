package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/4/15.
 */
public class L27_Burrito {
    Spiciness degree;
    public L27_Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        L27_Burrito
                plain = new L27_Burrito(Spiciness.HOT),
                greeenChile = new L27_Burrito(Spiciness.MEDIUM),
                jalapeno = new L27_Burrito(Spiciness.HOT);
        plain.describe();
        greeenChile.describe();
        jalapeno.describe();
    }
}
