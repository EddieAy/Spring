package client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvokeHandler implements InvocationHandler {

    private Object target;

    public TimeInvokeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long begin = System.currentTimeMillis();

        Object returnValue = method.invoke(target,args);

        long end = System.currentTimeMillis();
        System.out.println("Time is " + (end - begin) + " ms");

        return returnValue;
    }
}
