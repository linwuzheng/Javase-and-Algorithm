package itheima.java.method;

//创建方法打印数组元素
public class MethodTest05 {
    public static void main(String[] args) {
        int[] arrs = {2,5,86,7,4,5,6,2,1,7,8,8};
        printArray(arrs);
    }
    public static void printArray(int[] arrs){
        System.out.print("[");
        if(arrs != null && arrs.length > 0){
            for (int i = 0; i < arrs.length; i++) {
                System.out.print(i == arrs.length-1 ? arrs[i] : arrs[i]+",");
            }
        }
        System.out.println("]");
    }
}
