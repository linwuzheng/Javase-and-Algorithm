package Algorithm;
//动态规划算法：打家劫舍；使用递归实现
public class Rob {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {2,7,5,4,8,11};
        int[] nums3 = {1,4,2,12,18,13};
        int[] nums4 = {11,14,21,19,5,12};

        System.out.println(maxMoney(nums1,nums1.length-1));
        System.out.println(maxMoney(nums2,nums2.length-1));
        System.out.println(maxMoney(nums3,nums3.length-1));
        System.out.println(maxMoney(nums4,nums4.length-1));


    }
    public static int maxMoney(int[] nums,int index){
        if(nums == null || index < 0){
            return 0;
        }
        if(index == 0){
            return nums[0];
        }
        return Math.max(maxMoney(nums,index - 1),maxMoney(nums,index - 2) + nums[index]);

    }
}
