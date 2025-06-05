class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        } 
        String pre=strs[0];
        for(String s:strs){
             while(!s.startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
                if(pre.isEmpty()){
                    return "";
                }
             }
        }
        return pre; 
    }
}