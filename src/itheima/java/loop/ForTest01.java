package itheima.java.loop;

//练习，顺序求和
public class ForTest01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i <= 10;i++){
            sum += i;
        }
        System.out.println("1-10的和是："+sum);
    }
}
