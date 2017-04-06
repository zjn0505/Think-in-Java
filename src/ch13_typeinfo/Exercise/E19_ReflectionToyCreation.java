package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/4/6.
 */

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/****************** Exercise 19 *****************
 * In ToyTest.java, use reflection to create a
 * Toy object using the nondefault constructor.
 ***********************************************/

class SuperToy extends FancierToy {
    int IQ;
    public SuperToy(int intelligence) { IQ = intelligence; }
    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}

public class E19_ReflectionToyCreation {
    public static Toy makeToy(String toyName, int IQ) {
        try {
            Class<?> tClass = Class.forName(toyName);
            for (Constructor<?> ctor : tClass.getConstructors()) {
                // Look for a constructor with a single parameter:
                Class<?>[] params = ctor.getParameterTypes();
                if (params.length == 1)
                    if (params[0] == int.class)
                        return (Toy)ctor.newInstance(
                            new Object[] {Integer.valueOf(IQ)});
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(makeToy("ch13_typeinfo.Exercise.SuperToy", 150));
    }
}
