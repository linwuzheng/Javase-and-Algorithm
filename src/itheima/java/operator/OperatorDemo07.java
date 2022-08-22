package itheima.java.operator;

//三元运算符的使用
public class OperatorDemo07 {
    public static void main(String[] args) {
        double score = 78;
        String rs = score >= 60 ? "考试通过" : "挂科";
        System.out.println(rs);

        int a = 142;
        int b = 123;
        int max = a > b ? a : b;
        System.out.println(max);

        System.out.println("-----找三个数的最大值----");
        int i = 45;
        int j = 26;
        int k = 38;
        int mid = j > i ? j : i;
        int max1 = mid >k ? mid : k;
        System.out.println(max1);

        System.out.println("-----找三个数的最大值优化----");
        int max2 = j > i ? (j>k ? j : k) : (i > k ? i : k);
        System.out.println(max2);
    }
}
