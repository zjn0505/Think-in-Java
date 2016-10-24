package ch08_interfaces.Lesson;

import java.util.Random;

/**
 * Created by Jienan on 2016/10/24.
 */
public interface L12_RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;

}
