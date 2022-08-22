package itheima.java.type;

//表达式的自动类型转换，自动转换成更大的
public class TypeDemo02 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double sum1 = a+b+c;
        System.out.println(sum1);

        double sum2 = a+b-2.3;
        System.out.println(sum2);

        byte i = 100;
        byte j = 120;
        int k = i + j;
        System.out.println(k);
    }
}
