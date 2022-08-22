package itheima.javapro.lambda;

import itheima.javapro.polymorphic.Animal;

//体会使用Lambda表达式简化匿名内部类的写法，这是正常的写法
public class LambdaDemo01 {
    public static void main(String[] args) {
        Animals dog = new Animals() {
            @Override
            public void run(){
                System.out.println("狗跑的贼快！！！");
            }
        };
        dog.run();
    }
}

    abstract class Animals{
    public abstract void run();
}