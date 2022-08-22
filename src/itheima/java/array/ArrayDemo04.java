package itheima.java.array;

//数组的默认值
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        char[] chars = new char[10];
        System.out.println((int)chars[0]);
        System.out.println((int)chars[9]);

        double[] scores = new double[10];
        System.out.println(scores[0]);
        System.out.println(scores[9]);

        boolean[] booleans = new boolean[10];
        System.out.println(booleans[0]);
        System.out.println(booleans[9]);

        String[] names = new String[10];
        System.out.println(names[0]);
        System.out.println(names[9]);

    }
}
