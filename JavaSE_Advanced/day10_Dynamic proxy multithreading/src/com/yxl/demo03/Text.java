package com.yxl.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Text {
    public static Star starProxy(BigStar bigStar ){
        Star proxy = (Star) Proxy.newProxyInstance(Text.class.getClassLoader(),
                bigStar.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String methodName = method.getName();
                        if (methodName.equals("sing")){
                            System.out.println("唱歌收费1000w");

                        }else if (methodName.equals("dance")){
                            System.out.println("跳舞需要篮球🏀");
                        }

                        return method.invoke(bigStar,args);
                    }
                }
                );
        return proxy;
    }



    public static void main(String[] args) {
     BigStar bigStar = new BigStar("蔡徐坤");
     starProxy(bigStar).dance();
     starProxy(bigStar).sing("及你太美");
    }
}
