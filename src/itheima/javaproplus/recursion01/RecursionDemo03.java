package itheima.javaproplus.recursion01;

/*
递归学习案例
猴子吃桃问题：第一天吃了一半多一个，第二天吃前一天剩下的一半多一个，以此类推，第十天剩余1个，
求第n（n > 0 &&n <10）天的桃子数?
f(n-1)/2-1=f(n);
f(n-1) = 2*f(n) + 2;
*/

public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(5));

    }
    public static int f(int n){
        if(n == 10){
            return 1;
        }else {
            return f(n+1)*2 + 2;
        }
    }
}
