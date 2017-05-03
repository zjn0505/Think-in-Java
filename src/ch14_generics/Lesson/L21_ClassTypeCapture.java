package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 03/05/2017.
 */

class Building {}
class House extends Building {}

public class L21_ClassTypeCapture<T> {
    Class<T> kind;
    public L21_ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        L21_ClassTypeCapture<Building> ctt1 =
            new L21_ClassTypeCapture<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        L21_ClassTypeCapture<House> ctt2 =
            new L21_ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));


    }
}
