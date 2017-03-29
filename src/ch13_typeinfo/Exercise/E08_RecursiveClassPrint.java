package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/3/29.
 */
// {Args: ch13_typeinfo.Lesson.Circle ch13_typeinfo.Lesson.toys.FancyToy}
/****************** Exercise 8 ******************
 * Write a method that takes an object and
 * recursively prints all the classes in that
 * object's hierarchy.
 ***********************************************/
public class E08_RecursiveClassPrint {
    static void printClasses(Class<?> c) {
        // getSuperclass() returns null on Object;
        if (c == null)
            return;
        System.out.println(c.getName());
        // Produces the interfaces that this class implements:
        for (Class<?> k : c.getInterfaces()) {
            System.out.println("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String[] args) throws Exception {
        printClasses(new E08_RecursiveClassPrint().getClass());
        for (int i = 0; i < args.length; i++) {
            System.out.println("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1)
                System.out.println("========================");
        }
    }
}
