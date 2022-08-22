package itheima.java.method;

//用方法判断数字的奇偶性
public class MethodTest02 {
    public static void main(String[] args) {
        check(11);
        check(100);
    }
    public static void check(int n){
        if(n % 2 == 0){
            System.out.println(n + "是偶数");
        }else {
            System.out.println(n+"是奇数");
        }
    }
}
