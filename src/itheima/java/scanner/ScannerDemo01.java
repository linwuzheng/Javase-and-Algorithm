package itheima.java.scanner;

import java.util.Scanner;


//API的使用,键盘录入
public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("你的年龄是：" + age);

        System.out.println("请输入你的名字：");
        String name = sc.next();
        System.out.println("欢迎:" + name);
    }
}
