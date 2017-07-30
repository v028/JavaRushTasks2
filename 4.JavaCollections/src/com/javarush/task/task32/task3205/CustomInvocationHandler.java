package com.javarush.task.task32.task3205;//Created by Vitaly Yakovlev on 28.07.2017.

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods obj;

    public CustomInvocationHandler(SomeInterfaceWithMethods obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object result = method.invoke(obj, args);
        System.out.println(method.getName() + " out");
        return result;
    }
}