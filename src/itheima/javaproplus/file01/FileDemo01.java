package itheima.javaproplus.file01;
import java.io.File;


//文件流的学习
public class FileDemo01 {
    public static void main(String[] args){
//        创建文件对象（直接输入文件路径:绝对路径，也可以用相对路径，相对到工程，方便转移）
        File f = new File("D:\\FFOutput\\电脑壁纸\\1618399256682.jpeg");
        long size = f.length();  //是文件的字节大小
        System.out.println(size);
//相对路径创建文件对象,相对路径从模块名开始写,因为我这里只有一个模块,所以省略了模块名直接从src开始
        File f1 = new File("src\\itheima\\file01\\file01.txt");
        long size01 = f1.length();
        System.out.println(size01);
//判断文件存在与否
        System.out.println(f.exists());
        System.out.println(f1.exists());
    }
}
