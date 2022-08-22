package itheima.javaproplus.file01;

import java.io.File;

//文件目录的相关操作，文件名称和文件对象的遍历
public class FileDemo03 {
    public static void main(String[] args) {

        File f1  = new File("D:\\FFOutput\\电脑壁纸");

        String[] names = f1.list();
        for (String name: names) {
            System.out.println(name);
        }

        File[] files = f1.listFiles();
        for (File f: files
             ) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
