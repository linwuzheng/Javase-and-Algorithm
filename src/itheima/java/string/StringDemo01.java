package itheima.java.string;

//字符串的创建及特点，双引号直接给出来的才会相等
public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "黑马乘车v元";
        String s2 = "黑马乘车v元";
        System.out.println(s1 == s2);
        System.out.println("----------");
        String s3 = new String("学习使我快乐");
        String s4 = new String("学习使我快乐");
        System.out.println(s3 == s4);
        System.out.println("----------");
        char[] c1 = {'a','f','r','o','p'};
        String s5 = new String(c1);
        String s6 = new String(c1);
        System.out.println(s5 == s6);
    }
}
