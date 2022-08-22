package itheima.javapro.polymorphic;

public class Dog extends Animal{
    String name = "狗的名字";

    @Override
    public void run(){
        System.out.println("狗跑的很快");
    }

    public void lookDoor(){
        System.out.println("狗正在看门");
    }
}
