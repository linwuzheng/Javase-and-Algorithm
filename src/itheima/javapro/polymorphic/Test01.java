package itheima.javapro.polymorphic;

//成员方法调用：编译看左边，运行看右边（多态侧重行为多态）
//成员变量调用：编译看左边，运行也看左边
public class Test01 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.run();
        System.out.println(d.name);

        Animal t = new Tortoise();
        t.run();
        System.out.println(t.name);
    }

}
