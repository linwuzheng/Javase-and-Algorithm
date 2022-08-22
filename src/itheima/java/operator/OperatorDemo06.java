package itheima.java.operator;


import java.util.jar.JarOutputStream;

//逻辑运算符 与& 或| 非！ 异或^
public class OperatorDemo06 {
    public static void main(String[] args) {
        double size = 9.8;
        double storage = 6;
        System.out.println(size >=6.95 & storage >=8);//false
        System.out.println(size >=6.95 | storage >=8);//true

        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);

        System.out.println("------短路与和短路或------");

        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10);
        System.out.println(b);//右边不再执行

        System.out.println(a > 100 || ++b > 10);

        System.out.println(b);//右边继续执行
    }
}
