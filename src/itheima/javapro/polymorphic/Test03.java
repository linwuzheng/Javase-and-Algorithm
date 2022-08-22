package itheima.javapro.polymorphic;

//多态不能调用子类独有的方法,可以通过强制类型转换调用,通过 子类对象+instanceof+父类名  判断是谁的子类
public class Test03 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
//      a.lookDoor();
        Dog d = (Dog) a;
        d.lookDoor();
    }
}
