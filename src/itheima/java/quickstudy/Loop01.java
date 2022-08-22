package itheima.java.quickstudy;


//循环语句，打印+求和
public class Loop01 {
    public static void main(String[] args) {
        for(int i = 0;i < 10;i++){
            System.out.println("Hello");
        }
        int sum = 0;
        for(int i = 0;i <101;i++){
            sum +=i;
        }
        System.out.println("sum="+sum);
    }
}
