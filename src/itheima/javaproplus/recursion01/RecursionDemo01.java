package itheima.javaproplus.recursion01;

//递归的学习使用,使用递归计算某个正整数的阶乘
public class RecursionDemo01 {
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f(5));

    }
    public static int f(int n){
        if(n == 1){
            return 1;
        }else {
            return f(n - 1) * n;
        }
    }
}
