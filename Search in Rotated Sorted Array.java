public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return find(A, target, 0, A.length-1); 
    }
    int find(int[] A, int target, int start, int end)
    {
        if(start>end) return -1; 
        int mid=start+(end-start)/2; 
        if(A[mid]==target)
        {
            return mid; 
        }
        else if(A[start]<=A[mid])
        {
            if(A[start]<=target && target<A[mid])
            {
                return find(A, target, start, mid-1);
            }else
            {
                return find(A, target, mid+1, end);
            }
            
        }else
        {
            if(A[mid]<target && target<=A[end])
            {
                return find(A, target, mid+1, end);
            }else
            {
                return find(A, target, start, mid-1);
            }
        }
    }
}
