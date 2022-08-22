package itheima.java.forobject;

//使用构造器创建方法
public class CarConstructorTest {
    public static void main(String[] args) {
        CarConstructor cs = new CarConstructor();
        cs.name="奔驰";
        cs.price=39.9;
        System.out.println(cs.name);
        System.out.println(cs.price);
        System.out.println("---------------");
        CarConstructor cs1 = new CarConstructor("大众",22.22);
        System.out.println(cs1.name);
        System.out.println(cs1.price);
    }
}
