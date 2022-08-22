package itheima.java.quickstudy;

import java.text.NumberFormat;
import java.util.Scanner;

//针对Calculator的改进
public class Calculator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入贷款本金：(>0)");
        Double p = scanner.nextDouble();
        if (p > 0) {
            System.out.println("请输入年利率：(1-36)");
            Double yr = scanner.nextDouble();
            Double mr = yr / 12.0 / 100;
            if (yr > 1 && yr < 36) {
                System.out.println("请输入还款月数：(1-360)");
                int m = scanner.nextInt();
                if(m > 1 && m < 360) {
                    Double payment = p * mr * Math.pow((1 + mr), m) / (Math.pow((1 + mr), m) - 1);
                    System.out.println("每月偿还的贷款为：" + NumberFormat.getCurrencyInstance().format(payment));
                }else{
                    System.out.println("还款月数必须在1-360");
                }
                }else{
                System.out.println("年利率范围必须在1-36");
            }

        }else {
            System.out.println("贷款金额必须>0");
        }
    }
}

