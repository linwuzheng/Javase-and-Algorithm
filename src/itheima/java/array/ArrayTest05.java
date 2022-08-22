package itheima.java.array;

//数组的内存地址
public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr1 = {25,14,56,35};
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 0;
        System.out.println(arr1[1]);
    }
}
