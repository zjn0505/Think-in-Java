package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/8/30.
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refcount++;
    }
    public void dispose() {
        if(--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class L08_ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = { new Composing(shared),
        new Composing(shared), new Composing(shared),
        new Composing(shared), new Composing(shared)};
        for (Composing c : composings)
            c.dispose();
    }
}
