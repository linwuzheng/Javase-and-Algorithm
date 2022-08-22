package itheima.java.string;

//字符串常考面试题
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = new String("我是中国人");//堆内存中和字符串常量池中都有
        String s2 = "我是中国人";//在字符串常量池中
        System.out.println(s1 == s2);

        System.out.println("--------------");

        String s3 = "abc";
        String s4 = "ab";
        String s5 = "ab"+"c";
        System.out.println(s3 == s5);

        System.out.println("--------------");

        String s6 = "abc";
        String s7 = "ab";
        String s8 = s7+"c";
        System.out.println(s6 == s8);
    }
}
