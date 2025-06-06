class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maj=-1;
        for(int i=0;i<nums.length;i++){
             if(count==0){
                maj=nums[i];
             }
              if(nums[i]==maj){
                count=count+1;
             }
             else{
                count=count-1;
             }
        }
        return maj;
        }
}
