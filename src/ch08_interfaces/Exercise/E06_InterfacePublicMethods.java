package ch08_interfaces.Exercise;

import ch08_interfaces.Exercise.E05_ownpackage.AnInterface;

/**
 * Created by Jienan on 2016/10/13.
 */
public class E06_InterfacePublicMethods implements AnInterface{
    public void f() {}
    public void g() {}
    public void h() {}
    // Each of these produces a compile-time error message,
    // stating that you cannot reduce the access of the
    // base class public method in a derived class.
    //! void f() {}

}
