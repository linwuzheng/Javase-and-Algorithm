package itheima.java.arraylist;

import java.util.ArrayList;

//集合类型的规定，泛型的使用
public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("java");
        a1.add("黑那");
//        a1.add(2.5);报错
        System.out.println(a1);
    }
}
