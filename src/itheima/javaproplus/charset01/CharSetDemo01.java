package itheima.javaproplus.charset01;

import java.util.Arrays;

//字符集String的编码和解码，默认UTF-8，可通过指定字符集的方式进行编码
public class CharSetDemo01 {
    public static void main(String[] args) throws Exception{
//        1.编码
        String name = "abc我爱中国123";
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

//        2.解码（需要保持与编码时相同的字符集）
        String rs = new String(bytes,"GBK");
        System.out.println(rs);
    }
}
