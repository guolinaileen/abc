public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] result=new int[2];
        result[0]=-1; result[1]=-1; 
        if(A.length<1) return result; 
        int start=0, end=A.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2; 
            if(A[mid]==target)
            {
                int left=mid; 
                while(left>start && A[left-1]==A[mid] )
                {
                    left--; 
                }
                result[0]=left;
                int right=mid; 
                while(right<end && A[right+1]==A[mid])
                {
                    right++; 
                }
                result[1]=right; 
                break; 
            }else if(A[mid]>target)
            {
                end=mid-1; 
            }else
            {
                start=mid+1; 
            }
        }
        return result; 
    }
}
