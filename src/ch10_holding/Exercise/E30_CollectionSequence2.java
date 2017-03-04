package ch10_holding.Exercise;

/**
 * Created by jienanzhang on 04/03/2017.
 */

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Collection;
import java.util.Iterator;

/****************** Exercise 30 *****************
 * Modify CollectionSequence.java so that it does
 * not inherit from AbstractCollection, but instead
 * implements Collection.
 ***********************************************/

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

class CollectionSequence2 extends PetSequence implements Collection<Pet> {

    static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }
    static void display(Collection<Pet> pets) {
        for(Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return pets.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) return false;
        for (int i = 0; i < pets.length; i++)
            if (o.equals(pets[i])) return true;
        return false;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[pets.length];
        System.arraycopy(pets, 0, result, 0, pets.length);
        return new Object[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < pets.length)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), pets.length);
        T[] result = a;
        System.arraycopy(pets, 0, result, 0, pets.length);
        if (result.length > pets.length)
            result[pets.length] = null;
        return result;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}

public class E30_CollectionSequence2 {
}
