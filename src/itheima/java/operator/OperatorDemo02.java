package itheima.java.operator;

//+使用时能加则加，不能加则作为连接符
public class OperatorDemo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        System.out.println(c + 'i');
        System.out.println(c + "itheima");
    }
}
