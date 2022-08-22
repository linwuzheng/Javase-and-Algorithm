package itheima.java.loop;

//求1-10的奇数的和——两种方法
public class ForTest02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i<=10;i++){
            if(i % 2 ==1){
                sum += i;
            }
        }
        System.out.println("1-10的奇数和是（方法1）："+sum);
        System.out.println("-------------");
        int sum1=0;
        for(int j=1;j<=10;j += 2){
            sum1 += j;
        }
        System.out.println("1-10的奇数和是（方法2）："+sum1);
    }
}
