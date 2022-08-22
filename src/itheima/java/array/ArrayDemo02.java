package itheima.java.array;

// 访问数组的元素及续长度
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] ages = {65,78,37};
//        取值
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
//        赋值
        ages[2] = 100;
        System.out.println(ages[2]);
//        访问长度
        System.out.println(ages.length);
    }
}
