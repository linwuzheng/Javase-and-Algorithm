package itheima.java.loop;

import java.util.Random;
import java.util.Scanner;

//  猜数字大小，直到猜到正确的数字
public class RandomTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckyNumber = r.nextInt(100)+1;
        Scanner sr = new Scanner(System.in);
//        利用死循环实现不断询问，直到命中
        while (true){
            System.out.println("请输入你猜测的数字（1-100）：");
            int guessNumber = sr.nextInt();
            if (guessNumber > luckyNumber){
                System.out.println("你输入的数字太大了！");
            }else if(guessNumber < luckyNumber){
                System.out.println("你输入的数字太小了！");
            }else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }

    }
}
