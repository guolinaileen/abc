public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start=0; 
        int end=A.length-1; 
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(A[mid]==target) return mid; 
            if(A[mid]<target)
            {
                start=mid+1; 
            }else
            {
                end=mid-1; 
            }
        }
        return start; 
    }
}
