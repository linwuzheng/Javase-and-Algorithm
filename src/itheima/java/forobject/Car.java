package itheima.java.forobject;

//面向对象——对象的创建
public class Car {

    String name;
    double price;

    public void start(){
        System.out.println(name+"启动了~~~~");
    }

    public void run(){
        System.out.println("价格是"+price+"的"+name+"跑的很快");
    }
}
