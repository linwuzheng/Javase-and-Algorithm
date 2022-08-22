package itheima.javaproplus.bytestream;

import java.io.FileInputStream;
import java.io.InputStream;

//文件字节输入流的创建与读取
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception{
//      创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src\\itheima\\javaproplus\\bytestream\\data.txt");

        /*
        //一个一个字节读，效率太低
        int b1 = is.read();
        System.out.println(b1);
        System.out.println((char)b1);
        */
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char)b);
//            中文产生乱码，因为一个中文有三个字节
        }
    }
}
