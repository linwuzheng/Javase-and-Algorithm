package itheima.javaproplus.file01;

import java.io.File;
import java.text.SimpleDateFormat;

//文件流的操作
public class FileDemo02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\FFOutput\\电脑壁纸\\1618399256682.jpeg");

        System.out.println(f1.getAbsolutePath());

        System.out.println(f1.getPath());

        System.out.println(f1.getName());

        System.out.println(f1.length());

        long time = f1.lastModified();
        System.out.println("最后修改时间:"+ new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
    }
}
