package itheima.java.method;

//java基本数据类型值传递的机制，区别于形参
public class MethodDemo03 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
    public static void change(int a){
        System.out.println(a);
        a += 3;
        System.out.println(a);
    }
}
