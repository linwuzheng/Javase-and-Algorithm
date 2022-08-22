package itheima.java.string;

import java.util.Random;

//随机生成5位数的验证码
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rs = new Random();
        String s2 = "";
        for (int i = 0; i < 5; i++) {
            int index = rs.nextInt(s1.length());
            char s3 = s1.charAt(index);
             s2 += s3;
        }
        System.out.println(s2);

    }
}
