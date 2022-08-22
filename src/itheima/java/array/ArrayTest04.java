package itheima.java.array;

import java.util.Random;
import java.util.Scanner;

//录入工号，随机输出一个顺序
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入工号：");
            codes[i] = sc.nextInt();
        }
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(5);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }
    }
}
