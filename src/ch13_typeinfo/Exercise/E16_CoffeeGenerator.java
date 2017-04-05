package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/4/5.
 */


import ch13_typeinfo.Exercise.E16_coffee2.Coffee;
import net.mindview.util.Generator;

import java.util.Iterator;

/****************** Exercise 16 *****************
 * Modify the Coffee hierarchy in the Generics
 * chapter to use Registered Factories.
 ***********************************************/
public class E16_CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    public E16_CoffeeGenerator() {}
    private int size = 0;
    public E16_CoffeeGenerator(int sz) { size = sz; }
    @Override
    public Coffee next() {
        return Coffee.createRandom();
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public Coffee next() {
            count--;
            return E16_CoffeeGenerator.this.next();
        }
        public void remove() {} // Not implemented
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        for (Coffee c : new E16_CoffeeGenerator(10))
            System.out.println(c);
    }

}
// TODO
