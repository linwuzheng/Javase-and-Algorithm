package itheima.java.quickstudy;

import java.text.NumberFormat;
import java.util.Scanner;

//计算每月偿还的贷款
/*
* 公式 偿还贷款=p*mr*(1+mr)^m/((1+mr)^m-1)
* 其中   p 为贷款本金
*       mr为月利率
*       m为还款月数
* */
public class Calculator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入贷款本金：");

        Double p = sc.nextDouble();
        System.out.println("请输入年利率：");
        Double yr = sc.nextDouble();
        Double mr = yr/12.0/100;
        System.out.println("请输入还款月数：");
        int m = sc.nextInt();
        Double payment = p*mr*Math.pow((1+mr),m)/(Math.pow((1+mr),m)-1);
        System.out.println("每月偿还的贷款为："+ NumberFormat.getCurrencyInstance().format(payment));

    }

}
