class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String max = "";
        String sub="";
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
                l--;
                r++;
                if(l==-1 &&s.length()==r){
                    break;
                }
            }
             sub=s.substring(l+1,r);
            if(sub.length()>max.length()){
            max=sub;
            }
            l = i-1;
            r = i;
            while (l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)) {
                 l--;
                 r++;
                 if(l==-1 &&s.length()==r){
                    break;
                }
            }
             sub=s.substring(l+1,r);
            if(sub.length()>max.length()){
            max=sub;
            }
        }

        return max;
    }
}