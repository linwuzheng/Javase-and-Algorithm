package itheima.javapro.constructor01;

//测试构造器的使用
public class ConstructorTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);

        Dog d1 = new Dog("大黄");
        System.out.println(d1);
    }
}
