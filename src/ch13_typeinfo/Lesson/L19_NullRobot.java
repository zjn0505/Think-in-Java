package ch13_typeinfo.Lesson;

import net.mindview.util.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jienan on 2017/4/7.
 */

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private L19_Robot proxied = new NRobot();
    NullRobotProxyHandler(Class<? extends L19_Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
    private class NRobot implements Null, L19_Robot {

        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<L19_Operation> operations() {
            return Collections.emptyList();
        }
    }
}

public class L19_NullRobot {
    public static L19_Robot newNullRobot(Class<? extends L19_Robot> type) {
        return (L19_Robot) Proxy.newProxyInstance(
            L19_NullRobot.class.getClassLoader(),
                new Class[] { Null.class, L19_Robot.class },
                new NullRobotProxyHandler(type)
        );
    }

    public static void main(String[] args) {
        L19_Robot[] bots = {
            new L19_SnowRemovalRobot("SnowBee"),
            newNullRobot(L19_SnowRemovalRobot.class)
        };
        for (L19_Robot bot : bots)
            L19_Robot.Test.test(bot);
    }
}
