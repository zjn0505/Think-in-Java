package ch11_exceptions.Exercise;

/**
 * Created by jienanzhang on 10/03/2017.
 */
/****************** Exercise 8 ******************
 * Write a class with a method that throws an
 * exception of the type created in Exercise 4.
 * Try compiling it without an exception
 * specification to see what the compiler says.
 * Add the appropriate exception specification.
 * Try out your class and its exception inside a
 * try-catch clause.
 ***********************************************/


class Thrower {
    public void f() {
        //! throw new MyException("Inside f()");
    }
    public void g() throws MyException {
        throw new MyException("Inside g()");

    }
}


public class E08_ExceptionSpecification {
    public static void main(String[] args) {
        Thrower t = new Thrower();
        try {
            t.g();
        } catch (MyException e) {
            e.printStackTrace();
            e.printMsg();
        }
    }
}
