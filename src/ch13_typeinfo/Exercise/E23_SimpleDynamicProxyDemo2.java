package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/4/6.
 */
// {ThrowsException} StackOverflowError

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/****************** Exercise 23 *****************
 * Inside invoke() in SimpleDynamicProxy.java,
 * try to print the proxy argument and explain
 * what happens.
 ************************************************/
class DynamicProxyHandler2 implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler2(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{

        System.out.println("proxy: " + proxy);
        return method.invoke(proxied, args);
    }
}

public class E23_SimpleDynamicProxyDemo2 {
    public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
}

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler2(real)
        );
        consumer(proxy);
    }
}
