package itheima.java.arraylist;

import java.util.ArrayList;

//集合常用api的使用
public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("黑马");
        a1.add("李四");
        a1.add("总会");
        a1.add("袁绍");
        System.out.println(a1);

        String s1 = a1.get(2);
        System.out.println(s1);

        int a= a1.size();
        System.out.println(a);

        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i));
        }

        System.out.println(a1.remove(1));
        System.out.println(a1);

        System.out.println(a1.remove("黑马"));
        System.out.println(a1);

        System.out.println(a1.set(0, "mingtain"));
        System.out.println(a1);
    }
}
