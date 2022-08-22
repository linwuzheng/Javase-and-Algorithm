package itheima.java.array;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

//随机生成1-20的五个数，并猜测，知道猜中并返回第一次出现的位置，打印五个数，结束
public class ArrayTest03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20)+1;
        }
        OUT:
        while (true){
        System.out.println("请输入你猜测的数据（1-20）：");
        int j = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(j == arr[i]){
                System.out.println("恭喜你猜对了！");
                System.out.println("正确数字是第"+(i+1)+"个");
                for (int i1 = 0; i1 < arr.length; i1++) {
                    System.out.println(arr[i1]);
                }
                break OUT;
            }
        }
        System.out.println("请重新猜测！");

    }

}
}
