public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int[2];
        result[0]=-1; 
        result[1]=-1; 
        if(A.length==0) return result; 
        int low=0, high=A.length; 
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]<target)
            {
                low=mid+1; 
            }else
            {
                high=mid; 
            }
        }
        if(low>=A.length || A[low]!=target)
        {
           return result; 
        }
        result[0]=low;
        high=A.length; 
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]>target)
            {
                high=mid; 
            }else
            {
                low=mid+1; 
            }
        }
        result[1]=high-1;
        return result; 
    }
}
