public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return -1; 
        return searchRotate(A, 0, A.length-1, target);

    }
    int searchRotate(int [] A, int start, int end, int target)
    {
        if(start<=end)
        {
            int mid=start+(end-start)/2;
            if(A[mid]==target)
            return mid; 
            if(A[mid]<target)
            {
                if(A[start]<A[mid])
                return searchRotate(A, mid+1, end, target);
                int temp=searchRotate(A, mid+1, end, target);
                if(temp!=-1) return temp; 
                return searchRotate(A, start, mid-1, target);
            }else
            { 
                if(A[end]>A[mid]) 
                return searchRotate(A, start, mid-1, target);
                int temp=searchRotate(A, start, mid-1, target);
                if(temp!=-1) return temp; 
                return searchRotate(A,mid+1, end, target);
            }
        }
        return -1; 
    }
}
