package itheima.javapro.arrays;

import java.util.Arrays;

//二分查找，前提是数组已经有序
public class Test02 {
    public static void main(String[] args) {
//        定义数组并排序
        int[] arr = {14,5,12,5,35,8,98,7,45,9,25};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,6));
//        使用二分查找实现
    }
    public static int binarySearch(int[] arr,int number){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int middleIndex = (left + right) / 2;
            if (number > arr[middleIndex]){
                left = middleIndex+1;
            }else if (number < arr[middleIndex]){
                right = middleIndex-1;
            }else {
                return middleIndex;
            }
        }
        return -1;
    }
}
