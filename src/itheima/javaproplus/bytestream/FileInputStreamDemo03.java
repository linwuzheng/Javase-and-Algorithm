package itheima.javaproplus.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//使用文件字节输入流一次性读完文件的全部字节，可以解决乱码问题
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception{
        File f = new File("src\\itheima\\javaproplus\\bytestream\\data03.txt");
        InputStream is = new FileInputStream(f);

        byte[] buffer = new byte[(int)f.length()];
        int len = is.read(buffer);
        System.out.println("读了多少个字节：" + len);
        System.out.println("文件大小：" + f.length());
        System.out.println(new String(buffer));



    }
}
