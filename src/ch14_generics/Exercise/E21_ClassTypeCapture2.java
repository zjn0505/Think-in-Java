package ch14_generics.Exercise;

/**
 * Created by jienanzhang on 03/05/2017.
 */

import java.util.HashMap;
import java.util.Map;

/****************** Exercise 21 *****************
 * Modify ClassTypeCapture.java by adding a
 * Map<String,Class<?>>, a method
 * addType(String typename, Class<?> kind), and a
 * method createNew(String typename).createNew()
 * will either produce a new instance of the class
 * associated with its argument string, or produce
 * an error message.
 ************************************************/

class Building {}
class House extends Building {}

class ClassTypeCapture2 {
    Map<String, Class<?>> types =
        new HashMap<String, Class<?>>();
    public Object createNew(String typename) {
        Class<?> cl = types.get(typename);
        try {
            return cl.newInstance();
        } catch (NullPointerException e) {
            System.out.println("Not a registered typename: " + typename);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
    public void addType(String typename, Class<?> kind) {
        types.put(typename, kind);
    }
}
public class E21_ClassTypeCapture2 {
    public static void main(String[] args) {
        ClassTypeCapture2 ctt = new ClassTypeCapture2();
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Product", Product.class);
        System.out.println(ctt.createNew("Building").getClass());
        System.out.println(ctt.createNew("House").getClass());
        ctt.createNew("Product");
        ctt.createNew("Car");
    }
}
