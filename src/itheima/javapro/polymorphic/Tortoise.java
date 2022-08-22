package itheima.javapro.polymorphic;

public class Tortoise extends Animal{
    String name= "乌龟的名字";

    @Override
    public void run(){
        System.out.println("乌龟跑的很慢~~~");
    }
}
