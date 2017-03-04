package ch10_holding.Lesson;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by jienanzhang on 04/03/2017.
 */
public class L26_CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() { return pets.length; }


    public static void main(String[] args) {
        L26_CollectionSequence c = new L26_CollectionSequence();
        L25_InterfaceVsIterator.display(c);
        L25_InterfaceVsIterator.display(c.iterator());
    }


}
