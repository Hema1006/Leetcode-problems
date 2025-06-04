class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=m*n-1;
        int flag=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midele=matrix[mid/n][mid%n];
            if(midele==target){
               return true;}
            else if(midele<target){
                left=mid+1;}
            else{
                right=mid-1;}}
    return false;
    }
}
