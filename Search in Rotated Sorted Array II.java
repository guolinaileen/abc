public class Solution {
    public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return false; 
        return searchRotate( A, 0, A.length-1, target); 
    }
    boolean searchRotate(int [] A, int start, int end, int target)
    {
        if(start<=end)
        {
            int mid=start+(end-start)/2;
            if(A[mid]==target)
            return true; 
            if(A[mid]<target)
            {
                if(A[start]<A[mid])
                return searchRotate(A, mid+1, end, target);
                boolean temp=searchRotate(A, mid+1, end, target);
                if(temp) return temp; 
                return searchRotate(A, start, mid-1, target);
            }else
            { 
                if(A[end]>A[mid]) 
                return searchRotate(A, start, mid-1, target);
                boolean temp=searchRotate(A, start, mid-1, target);
                if(temp) return temp; 
                return searchRotate(A,mid+1, end, target);
            }
        }
        return false; 
    }
}
