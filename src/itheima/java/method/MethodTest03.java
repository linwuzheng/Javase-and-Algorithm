package itheima.java.method;

//定义方法返回数组中的最大值
public class MethodTest03 {
    public static void main(String[] args) {
        int[] arrs = {15,2,45,78,3,5,655,478,123};
        System.out.println("最大值是："+getArrayMaxData(arrs));
    }
    public static int getArrayMaxData(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
