public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 1; 
        int n=A.length+1; 
        for(int i=0; i<A.length; i++)
        {
            if(A[i]<=0) A[i]=n; 
        }
        for(int i=0; i<A.length; i++)
        {
            int val=Math.abs(A[i]);
            if(val<n)
            {
                A[val-1]=-Math.abs(A[val-1]);
            }
        }
        for(int i=0; i<A.length; i++)
        {
            if(A[i]>0) return i+1; 
        }
        return n; 
    }
}
