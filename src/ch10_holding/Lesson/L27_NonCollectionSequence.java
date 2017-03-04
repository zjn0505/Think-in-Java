package ch10_holding.Lesson;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * Created by jienanzhang on 04/03/2017.
 */

// Producing an Iterator is the least-coupled way of connecting
// a sequence to a method that consumes that sequence, and puts
// far fewer constraints on the sequence class than does
// implementing Collection.

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class L27_NonCollectionSequence extends PetSequence {
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

    public static void main(String[] args) {
        L27_NonCollectionSequence nc = new L27_NonCollectionSequence();
        L25_InterfaceVsIterator.display(nc.iterator());
    }
}
