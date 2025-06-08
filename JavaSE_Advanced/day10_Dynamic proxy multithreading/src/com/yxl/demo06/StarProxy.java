package com.yxl.demo06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {

    public static  <T>T SProxy(T t){
        return (T) Proxy.newProxyInstance(
                StarProxy.class.getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.equals("sing")){
                            System.out.println("梦票10000");
                        }else {
                            System.out.println("emngpiao1000000");
                        }

                        return method.invoke(t,args);
                    }
                }
        );
    }
}
