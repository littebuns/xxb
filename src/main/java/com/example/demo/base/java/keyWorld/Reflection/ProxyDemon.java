package com.example.demo.base.java.keyWorld.Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemon {




    class xxb implements InvocationHandler{
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName());
            method.invoke(proxy, args);
            return null;
        }
    }

    public static void main(String[] args) {

        Class[] interfaces = {};
        Proxy.newProxyInstance(ProxyDemon.class.getClassLoader(), interfaces, null);
    }
}
