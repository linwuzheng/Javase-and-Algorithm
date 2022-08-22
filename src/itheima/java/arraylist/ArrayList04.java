package itheima.java.arraylist;

import java.util.ArrayList;

//集合遍历并操作案例（删除小于80分的分数）
public class ArrayList04 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(78);
        list1.add(82);
        list1.add(92);
        list1.add(71);
        list1.add(98);
        list1.add(63);
        list1.add(85);
        list1.add(5);
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) < 80){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
        System.out.println("--------------");
//        方法2，倒过来

    }
}
