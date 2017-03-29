package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/3/29.
 */
// {Args: Gum Cookie}
/****************** Exercise 7 ******************
 * Modify SweetShop.java so that each type of
 * object creation is controlled by a
 * command-line argument. That is, if your
 * command line is "java SweetShop Candy," then
 * only the Candy object is created. Notice how
 * you can control which Class objects are loaded
 * via the command-line argument.
 ***********************************************/
class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class E07_CommandLoad {
    public static void main(String[] args) throws ClassNotFoundException {
        for (String arg : args) {
            Class.forName("ch13_typeinfo.Exercise." + arg);
        }
    }
}
