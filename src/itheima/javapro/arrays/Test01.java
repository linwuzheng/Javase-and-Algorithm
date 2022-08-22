package itheima.javapro.arrays;

import java.util.Arrays;

//选择排序算法
public class Test01 {
    public static void main(String[] args) {
        int[] a = {12,5,45,23,36,14,58,85,29,34,73,15};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
