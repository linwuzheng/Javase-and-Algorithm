package itheima.java.loop;

import java.util.Scanner;

//死循环的使用和终止      while（true）用的最多
public class DeadForDemo01 {
    public static void main(String[] args) {
        int okPassword= 520;
        Scanner sr = new Scanner(System.in);
        while(true){
            System.out.println("请输入正确的密码：");
            int password = sr.nextInt();
            if(password == okPassword){
                System.out.println("登录成功了---");
                break;
            }else{
                System.out.println("密码错误！");
            }

        }
    }
}
