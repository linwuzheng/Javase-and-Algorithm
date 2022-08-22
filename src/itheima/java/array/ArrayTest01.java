package itheima.java.array;

//数组的遍历求和
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {12,35,45,68,13,65};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总金额是："+sum);
    }
}
