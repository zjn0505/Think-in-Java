package ch14_generics.Lesson;

import net.mindview.util.Generator;

/**
 * Created by Jienan on 2017/4/11.
 */
public class L06_Fibonacci implements Generator<Integer>{
    private int count = 0;
    public Integer next() { return  fib(count++); }
    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        L06_Fibonacci gen = new L06_Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
    }

}
