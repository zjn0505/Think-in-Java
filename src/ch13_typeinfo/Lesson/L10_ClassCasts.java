package ch13_typeinfo.Lesson;

/**
 * Created by jienanzhang on 31/03/2017.
 */

class Building {}
class House extends Building {}

public class L10_ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... or just do this
    }
}
