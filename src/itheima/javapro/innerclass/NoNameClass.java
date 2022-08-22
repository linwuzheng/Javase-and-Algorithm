package itheima.javapro.innerclass;

//匿名内部类的创建使用
public class NoNameClass {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑起来了！！！！！");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}