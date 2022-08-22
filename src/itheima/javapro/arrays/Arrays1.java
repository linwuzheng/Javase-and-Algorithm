package itheima.javapro.arrays;
import java.util.Arrays;

//学会数组的常用API
public class Arrays1 {
    public static void main(String[] args) {
        int[] a = {10,85,7,86,25,47,12,35,96,78,24,65};

        System.out.println(a);
//1.返回数组内容
        System.out.println(Arrays.toString(a));
//2.排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//3.二分搜索，前提数组有序
        int index = Arrays.binarySearch(a,25);
        System.out.println(index);

        int index1 = Arrays.binarySearch(a,22);
        System.out.println(index1);
    }
}
