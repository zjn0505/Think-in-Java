package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/4/6.
 */
// {Args: ch13_typeinfo.Exercise.E18_ShowMethods3}

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/********************** Exercise 18 **********************
 * Make ShowMethods a non-public class and verify that
 * the synthesized default constructor no longer appears in
 * the output.
 *********************************************************/
class E18_ShowMethods3 {
    private static String usage =
            "usage:\n" +
            "E18_ShowMethods3 qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "E18_ShowMethods3 qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(method.toString());
                    System.out.println(
                            p.matcher(method.toString()).replaceAll("")
                    );
                    System.out.println();
                }
                for (Constructor ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else  {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(
                                p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                    System.out.println();
                }
                for (Constructor ctor : ctors)
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
