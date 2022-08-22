package itheima.javaproplus.bytestream;

import java.io.FileOutputStream;
import java.io.OutputStream;

//文件字节输出流
public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception{
//        该操作对原有的文件内容会丢失，可以加一个true
        OutputStream os = new FileOutputStream("src\\itheima\\javaproplus\\bytestream\\out04.txt");

        os.write('a');
        os.write(99);
        os.write(100);
        os.write("\r\n".getBytes());//换行

        byte[] buffer = {'g',101,102};
        os.write(buffer);
        os.write("\r\n".getBytes());//换行

        byte[] buffer1 = "我是中国人".getBytes();
        os.write(buffer1);
        os.write("\r\n".getBytes());

        byte[] buffer2 = {97,98,99,100};
        os.write(buffer2,0,2);
        os.write("\r\n".getBytes());
//关闭包含刷新功能
        os.close();
    }
}
