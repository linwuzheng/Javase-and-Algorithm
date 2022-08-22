package itheima.java.method;

//案例——用方法计算1-n的和并返回
public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("1-9的和是："+sum(9));
        System.out.println("1-100的和是："+sum(100));
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
