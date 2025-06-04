class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                mul=mul*nums[i];
            }
            else{
               zero++;
            }
        }
        if(zero==0){
            for(int i=0;i<nums.length;i++){
                nums[i]=mul/nums[i];
            }
        }
            else if(zero==1){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
               nums[i]=mul;
            }

            else{
                nums[i]=0;
            }
        }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            }
            return nums;
    
    }
}