package itheima.javaproplus.bytestream;

import java.io.FileInputStream;
import java.io.InputStream;

//使用文件字节输入流每次读取一个字节数组的数据
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception{
//       1. 创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src\\itheima\\javaproplus\\bytestream\\data.txt");

//      2.定义一个字节数组，用于读取字节数组,这种方式存在重复读的问题
       /* byte[] buffer = new byte[3];
        int len = is.read(buffer);
        System.out.println("读取了几个字节："+len);
        String rs = new String(buffer);
        System.out.println(rs);*/

//       3.改进（字节数组的大小影响读取是否产生乱码）
        byte[] buffer = new byte[3];
        int len ;
        while((len = is.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
        }
    }
}
