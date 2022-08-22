package itheima.java.operator;

//求一个三位数的个十百位
public class OperatorTest01 {
    public static void main(String[] args) {
        int a = 764;
        int ge = a % 10;
        System.out.println(ge);

        int shi = a / 10 % 10;
        System.out.println(shi);

        int bai = a / 100;
        System.out.println(bai);
    }
}
