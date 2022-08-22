package itheima.java.branch;

import java.util.Random;

//if分支结构的使用
public class IfDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        int heartBeat = r.nextInt(160);
        if (heartBeat<40 || heartBeat >120){
            System.out.println("你的每分钟心跳数是："+heartBeat+"，你可能需要进一步检查");
        }
        System.out.println("检查结束！");
        System.out.println("--------------");
        double money = r.nextInt(2629);
        if(money >=1314){
            System.out.println("当前红包发送成功~~~");
        }else{
            System.out.println("你自己都没钱就别发了~~~");
        }
        System.out.println("--------------");
//        根据得分输出绩效
        int score = r.nextInt(101);
        if (score <=60){
            System.out.println("你本月的绩效等级为：D");
        }else if (score > 60 && score <= 80){
            System.out.println("你本月的绩效等级为：C");
        }else if (score > 80 && score <= 90){
            System.out.println("你本月的绩效等级为：B");
        }else {
            System.out.println("你本月的绩效等级为：A");
        }
    }
}
