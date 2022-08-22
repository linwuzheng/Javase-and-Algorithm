package Algorithm;

import java.util.Arrays;

//找到数组中两边数加和相等的数的下标
public class ArrayCenterIndex {
    public static void main(String[] args) {
        System.out.println(centerIndex(new int[]{3,5,1,2,3,5,6}));
    }
    public static int centerIndex(int[] nums){
        int sum1 = Arrays.stream(nums).sum();
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 -= nums[i];
            if(sum1 == sum2){
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }
}
