package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/26.
 */

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implemention1 implements Service {
    private Implemention1() {}
    public void method1() {
        System.out.println("Implementation1 method1");
    }
    public void method2() {
        System.out.println("Implementation1 method2");
    }
    public static ServiceFactory factory =
        new ServiceFactory() {
            @Override
            public Service getService() {
                return new Implemention1();
            }
        };
}

class Implemention2 implements Service {
    private Implemention2() {}
    public void method1() {
        System.out.println("Implementation2 method1");
    }
    public void method2() {
        System.out.println("Implementation2 method2");
    }
    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implemention2();
                }
            };
}

public class L16_Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implemention1.factory);
        serviceConsumer(Implemention2.factory);
    }
}
