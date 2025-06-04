
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int flag=0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==target)
                {
                    flag=1;
                }  
        }
    }
        if(flag==1)
        {
            return true;
        }
        else
        {
           return false;
        }
       
    }
}