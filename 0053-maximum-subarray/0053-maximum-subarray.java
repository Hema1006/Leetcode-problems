class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
           current_sum=Math.max(nums[i],nums[i]+current_sum);
           max=Math.max(current_sum,max);
        }
        return max;
    }

}