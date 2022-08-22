package itheima.java.string;

import java.util.Scanner;

//登录密码案例，string API的使用一
public class StringDemo02 {
    public static void main(String[] args) {
        String okName = "林祥辉";
        String okPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String s1 = sc.next();
        System.out.println("请输入密码：");
        String s2 = sc.next();

        if(okName.equals(s1) && okPassword.equals(s2)){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败~~~~~~");
        }
    }
}
