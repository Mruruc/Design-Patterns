package com.mruruc.proxy_pattern.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {
    private final Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // pre-processing logic here
        System.out.println("Invoking method: " + method.getName());

        // Forward the method call to the real object
        Object result = method.invoke(target, args);

        // post-processing logic here
        System.out.println("Method " + method.getName() + " executed");

        return result;
    }
}
