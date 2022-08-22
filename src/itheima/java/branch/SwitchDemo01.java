package itheima.java.branch;

import java.util.Scanner;

//switch分支结构的学习（穿透性：可以将功能一样的部分集中起来，避免冗余）
public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("请输入今天星期几：");
        String weekday = sr.next();
        switch (weekday){
            case "星期一":
                System.out.println("上班第一天");
                break;
            case "星期二":
                System.out.println("上班第二天");
                break;
            case "星期三":
                System.out.println("上班第三天");
                break;
                case "星期四":
                System.out.println("上班第四天");
                break;
                case "星期五":
                System.out.println("上班第五天");
                break;
                case "星期六":
                System.out.println("今天休息日");
                break;
                case "星期日":
                System.out.println("今天休息第二天");
                break;
        }
    }
}
