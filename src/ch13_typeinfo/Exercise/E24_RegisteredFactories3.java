package ch13_typeinfo.Exercise;

/**
 * Created by jienanzhang on 08/04/2017.
 */

import net.mindview.util.Null;
import net.mindview.util.ProcessFiles;
import typeinfo.factory.Factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/****************** Exercise 24 *****************
 * Add Null Objects to RegisteredFactories.java.
 ************************************************/
class NullPartProxyHandler implements InvocationHandler {
    private String nullName;
    private IPart proxied = new NPart();
    NullPartProxyHandler(Class<? extends IPart> type) {
        nullName = type.getSimpleName() + ": [Null Part]";
    }
    private class NPart implements Null, IPart {
        public String toString() {
            return nullName;
        }
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}

interface IPart {}

class Part3 implements IPart {
    public String toString() {
        return getClass().getSimpleName();
    }
    public static IPart newNull(Class<? extends IPart> type) {
        return (IPart) Proxy.newProxyInstance(
                IPart.class.getClassLoader(),
                new Class[] { Null.class, IPart.class},
                new NullPartProxyHandler(type)
        );
    }

    static List<Factory<IPart>> partFactories =
            new ArrayList<Factory<IPart>>();
    static {
        partFactories.add(new FuelFilter3.Factory());
        partFactories.add(new AirFilter3.Factory());
        partFactories.add(new CabinAirFilter3.Factory());
        partFactories.add(new OilFilter3.Factory());
        partFactories.add(new FanBelt3.Factory());
        partFactories.add(new PowerSteeringBelt3.Factory());
        partFactories.add(new GeneratorBelt3.Factory());
    }
    private static Random rand = new Random(47);
    public static IPart createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
class Filter3 extends Part3 {}

class FuelFilter3 extends Filter3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new FuelFilter3(); }
    }
}

class AirFilter3 extends Filter3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new AirFilter3(); }
    }
}

class CabinAirFilter3 extends Filter3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new CabinAirFilter3(); }
    }
}

class OilFilter3 extends Filter3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new OilFilter3(); }
    }
}

class Belt3 extends Part3 {}

class FanBelt3 extends Belt3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new FanBelt3(); }
    }
}

class GeneratorBelt3 extends Belt3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new GeneratorBelt3(); }
    }
}

class PowerSteeringBelt3 extends Belt3 {
    public static class Factory implements typeinfo.factory.Factory<IPart> {
        public IPart create() { return new PowerSteeringBelt3(); }
    }
}


public class E24_RegisteredFactories3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            IPart part = Part3.createRandom();
            // Real Object
            System.out.println(part);
            // Null companion
            System.out.println(Part3.newNull(part.getClass()));
        }
    }
}
