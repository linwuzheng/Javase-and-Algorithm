package itheima.java.array;

//求数组中的最大值
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = {12,35,98,6,8,78,12,54,99};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
