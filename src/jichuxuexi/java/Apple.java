package jichuxuexi.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Connection;

//反射的例子
public class Apple {
    private int price;

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        apple.setPrice(10);
        System.out.println("苹果价格是："+apple.getPrice());

//        通过反射调用上述方法
        Class cl = Class.forName("jichuxuexi.java.Apple");
        Method setMethod = cl.getMethod("setPrice", int.class);
        Constructor appleConstructor = cl.getConstructor();
        Object appleObj = appleConstructor.newInstance();
        setMethod.invoke(appleObj,18);
        Method getPrice = cl.getMethod("getPrice");
        System.out.println("苹果价格是："+getPrice.invoke(appleObj));
    }
}
