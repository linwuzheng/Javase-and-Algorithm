package itheima.java.arraylist;

import java.util.ArrayList;

//arraylist集合的创建和使用
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("黑马");
        list.add("北京");
        list.add("江西");
        list.add(123);
        list.add(25.2);
        list.add(0.25);
        System.out.println(list);
        list.add(2,"赣州");
        System.out.println(list);
    }
}
