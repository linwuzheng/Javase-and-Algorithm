package itheima.java.forobject;

//构造器的使用
public class CarConstructor {
    String name;
    double price;

    public CarConstructor(){}

    public CarConstructor(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void start(){
        System.out.println(name+"启动了~~~~");
    }

    public void run(){
        System.out.println("价格是"+price+"的"+name+"跑的很快");
    }
}

