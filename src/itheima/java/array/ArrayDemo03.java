package itheima.java.array;

//数组的动态初始化及赋值
public class ArrayDemo03 {
    public static void main(String[] args) {
//        初始化
        double[] scores = new double[3];
//        赋值
        scores[1] = 94.6;
        System.out.println(scores[1]);
        System.out.println(scores[0]);

        String[] names = new String[55];
        names[18] = "迪丽热巴";
        names[28] = "黑马教育";
        System.out.println(names[18]);
        System.out.println(names[28]);
        System.out.println(names[0]);

    }
}
