package jichuxuexi.java;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"DD", "GG", "JJ", "MM"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //数组的复制(区别于赋值)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + "\t");
        }
        //数组的反转
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println();
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //查找或搜索
        String dest = "M";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.print("找到指定元素的位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.print("没有找到指定元素");
        }
        System.out.println();
        //二分法
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        int dest1 = -34;
        int head = 0;//初始的首索引
        int end = arr2.length - 1;//初始的末索引
        Boolean isFlag1 = true;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest1 == arr2[middle]) {
                System.out.println("找到了指定的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            } else if (arr2[middle] > dest1) {
                end = middle - 1;
            } else {//arr2[middle]< dest1
                head = middle + 1;
            }
        }
        if (isFlag1) {
            System.out.println("很遗憾没找到");
        }
        //冒泡排序法
        int[] arr3 = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = 0; j < arr3.length - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        for (int value : arr3) {
            System.out.print(value + "\t");
        }
        System.out.println();
        //Arrays类的使用
        int[] arr4 = new int[]{1, 8, 6, 9, 10, 5, 7, 2, 0, -2};
        Arrays.sort(arr4);
        System.out.print(Arrays.toString(arr4));
        System.out.println();
    }
}