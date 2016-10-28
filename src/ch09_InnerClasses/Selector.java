package ch09_InnerClasses;

/**
 * Created by Jienan on 2016/10/25.
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}