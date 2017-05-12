package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 12/05/2017.
 */
public class L35_Holder<T> {
    private T value;
    public L35_Holder() {}
    public L35_Holder(T val) { value = val; }
    public void set(T val) { value = val; }
    public T get() { return value; }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        L35_Holder<Apple> Apple = new L35_Holder<ch14_generics.Lesson.Apple>(new Apple());
        Apple d = Apple.get();
        // L35_Holder<Fruit> Fruit = Apple; // Cannot upcast
        L35_Holder<? extends Fruit> fruit = Apple; // OK
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
        try {
            Orange c = (Orange) fruit.get(); // No warning
        } catch (Exception e) {
            System.out.println(e);
        }
        // fruit.set(new Apple()); // Cannot call set()
        // fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d));
    }
}
