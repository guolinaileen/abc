public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0; 
        return search(A, 0, A.length-1, target);
    }
    int search(int [] A, int start, int end, int target)
    {
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
