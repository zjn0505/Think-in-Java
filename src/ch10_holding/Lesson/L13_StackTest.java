package ch10_holding.Lesson;

import util.Stack;

/**
 * Created by Jienan on 2017/2/27.
 */
public class L13_StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
