package itheima.javaproplus.recursion01;

//使用递归计算1到n的和
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println(h(100));
        System.out.println(h(5));

    }
    public static int h(int n) {
        if(n == 1){
            return 1;
        }else {
            return h(n - 1) + n;
        }
    }
}
