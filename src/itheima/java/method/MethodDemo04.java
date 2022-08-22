package itheima.java.method;

//java引用类型参数传递机制，地址值
public class MethodDemo04 {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,4};
        change(arrs);
        System.out.println(arrs[1]);
    }
    public static void change(int[] arrs){
        System.out.println(arrs[1]);
        arrs[1]=2222;
        System.out.println(arrs[1]);
    }
}
