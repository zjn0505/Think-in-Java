package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/8/30.
 */
class NonSharedMember {
    public NonSharedMember(String id) {
        System.out.println("Non shared member constructor " + id);
    }
}

class SharedMember {
    private int refcount;
    public void addRef() {
        System.out.println("Number of references " + ++refcount);
    }
    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }
}

public class E14_SharedRodentInitialization {
}
