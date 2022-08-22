package itheima.java.test;

import java.util.Scanner;

//计算机票价格
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double money = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入仓位：1、头等仓；2、经济舱");
        int type = sc.nextInt();
        System.out.println("你的机票价格是："+calculate(money, month, type));
    }
    public static double calculate(double money,int month,int type){
        if(month >= 5 && month <= 10){
            switch(type){
                case 1 :
                    money *= 0.9;
                    return money;
                case 2 :
                    money *= 0.85;
                    return money;
        }
        }else if(month == 11 ||month ==12 || month >=1 && month <=4){
            switch(type){
                case 1 :
                    money *= 0.7;
                    return money;
                case 2 :
                    money *= 0.65;
                    return money;
            }
        }
        return -1;
    }
}
