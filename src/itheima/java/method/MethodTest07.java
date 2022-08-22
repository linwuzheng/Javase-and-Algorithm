package itheima.java.method;

//定义方法判断两个数组是否相等
public class MethodTest07 {
    public static void main(String[] args) {
        int[] arrs3 = {1,2,3,4,5,6,7,8,9};
        int[] arrs4 = {1,2,3,4,5,6,7,8,8};
        System.out.println(equalArray(arrs3, arrs4));
    }

    public static boolean equalArray(int[] arrs1, int[] arrs2) {
        if (arrs1.length != arrs2.length) {
            return false;
        } else {
            for (int i = 0; i < arrs1.length; i++) {
                if (arrs1[i] != arrs2[i]) {
                    return false;
                }
            }
        }return true;
}
}
