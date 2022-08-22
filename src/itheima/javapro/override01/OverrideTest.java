package itheima.javapro.override01;

//静态方法不能被重写，因为不能被继承，谈不上重写
public class OverrideTest {
    public static void main(String[] args) {
        NewPhone iphone = new NewPhone();
        iphone.call();
        iphone.sendMessage();
    }
}
