package itheima.javapro.static01;

public class SingleInstanceDemo {
    public static void main(String[] args) {
        SingleInstance i1 = SingleInstance.instance;
        SingleInstance i2 = SingleInstance.instance;
        System.out.println(i1 == i2);
    }
}
