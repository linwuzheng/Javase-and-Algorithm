package itheima.javaproplus.recursion01;

import java.io.File;

//使用递归遍历搜索指定名称的文件
public class RecursionDemo04 {
    public static void main(String[] args) {
        File f = new File("D:\\FFOutput");
        searchFile(f,"常规浮选实验流程.png");

    }
    public static void searchFile(File dir,String fileName){
        if(dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();

            if(files != null && files.length > 0){
                for (File file: files) {
                    if(file.isFile()){
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了："+ file.getAbsolutePath());
                        }
                    }else {
                        searchFile(file,fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，你当前搜索的位置不是文件夹！！！");
        }
    }
}
