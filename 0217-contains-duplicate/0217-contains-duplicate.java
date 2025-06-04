class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int flag=1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
            set.add(nums[i]);
           }
        else{
            flag=0;
            break;
        }
        }
        boolean ans=flag==0?  true: false;
        return ans;
    }
}