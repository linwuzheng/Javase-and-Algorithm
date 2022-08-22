package itheima.javapro.polymorphic;

//利用多态实现解耦，使用不同的对象
public class Test02 {
    public static void main(String[] args) {
        Animal a = new Dog();
        go(a);

        Animal a1 = new Tortoise();
        go(a1);
    }
    public static void go(Animal a){
        System.out.println("开始~~~");
        a.run();
         System.out.println("结束~~~");


    }
}
