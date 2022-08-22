package itheima.java.loop;

import java.util.Random;

//随机数的获取
public class RandomDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1;i < 20;i++){
            int data = r.nextInt(10);
            System.out.println(data);
        }
        System.out.println("------------");
//        生成65-91的随机数
        int ran = r.nextInt(27)+65;
        System.out.println(ran);
    }
}
