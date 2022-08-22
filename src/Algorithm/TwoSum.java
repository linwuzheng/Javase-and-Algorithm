package Algorithm;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
         int[] num1= {2,8,96,7,5,9,6,3,4,8};
         System.out.println(twoSum(num1,11));
         printArrays(num1);
        System.out.println();
         printArrays(twoSum(num1,11));
        System.out.println();
        System.out.println(Arrays.toString(num1));
    }

        public static int[] twoSum(int[] nums,int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
//        打印数组
    public static void printArrays(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            if(i == 0){
                System.out.print("[" + arrays[0] + ", ");
            }else if(i == (arrays.length-1)){
                System.out.print(arrays[arrays.length-1] + "]");
            }else {
                System.out.print(arrays[i] + ", ");
            }
        }
    }
}

