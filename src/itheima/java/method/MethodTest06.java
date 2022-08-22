package itheima.java.method;

//定义方法接收数组和要查询的数，返回该数在数组中的位置，没有则返回-1
public class MethodTest06 {
    public static void main(String[] args) {
        int[] arrs = {12, 32, 4, 8, 59, 6, 45, 4};
        System.out.println(getIndex(arrs, 7));
    }

    public static int getIndex(int[] arrs, int a) {
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == a) {
                return (i + 1);
            }
        }
        return -1;
    }
}

