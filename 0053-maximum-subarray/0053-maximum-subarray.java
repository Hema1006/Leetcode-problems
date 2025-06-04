class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int current_sum=0;
        for(int i=0;i<nums.length;i++){
            current_sum=Math.max(nums[i],current_sum+nums[i]);
            max=Math.max(current_sum,max);
        }
        return max;
    }
}