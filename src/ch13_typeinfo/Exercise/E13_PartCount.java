package ch13_typeinfo.Exercise;

/**
 * Created by jienanzhang on 04/04/2017.
 */

import ch13_typeinfo.Lesson.L11_pets.TypeCounter;
import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/****************** Exercise 13 *****************
 * Use TypeCounter with the RegisteredFactories.java
 * example in this chapter.
 ***********************************************/
public class E13_PartCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        Part part;
        for (int i = 0; i < 20; i++) {
            part = Part.createRandom();
            System.out.print(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }
        System.out.println();
        System.out.println(counter);
    }
}
class Part {
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories =
            new ArrayList<Factory<? extends Part>>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    // Create a Class Factory for each specifc type:
    public static class Factory implements typeinfo.factory.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }
}

class AirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() { return new CabinAirFilter(); }
    }
}

class OilFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter(); }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() { return new GeneratorBelt(); }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() { return new PowerSteeringBelt(); }
    }
}

