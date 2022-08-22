package itheima.java.string;

//string API的使用二
public class StringDemo03 {
    public static void main(String[] args) {

        String s1 = "我来自江西a2";
        System.out.println(s1.length());
        System.out.println("------------");

        char c = s1.charAt(2);
        System.out.println(c);
        System.out.println("------------");
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            System.out.println(c1);
        }
        System.out.println("------------");
        char[] c2 = s1.toCharArray();
        for (int i = 0; i < c2.length; i++) {
            char c3 = c2[i];
            System.out.println(c3);
        }
        System.out.println("------------");
        String s4 = "我正在学习Java语言";
        String s5 = s4.substring(3,8);
        System.out.println(s5);
        System.out.println("------------");

        String s6 = "中国北京矿业大学北京研究生院北京";
        String s7 = s6.replace("北京","**");
        System.out.println(s7);
        System.out.println("------------");

        System.out.println(s6.contains("京矿"));
        System.out.println("------------");
        System.out.println(s6.startsWith("中国北"));

        System.out.println("------------");

        String s8 = "张三，李四，王五";
        String[] s9 = s8.split(",");
        for (int i = 0; i < s9.length; i++) {
            System.out.println(s9[i]);
        }
    }
}
