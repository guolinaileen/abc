public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=A.length+1;
        for(int i=0; i<A.length; i++)
        {
            if(A[i]<=0)
            {
                A[i]=length; 
            }
        }
        for(int i=0; i<A.length; i++)
        {
            if(A[i]>=length||A[i]<0||A[A[i]-1]==-A[i]) continue; 
            int temp=A[i];
            A[i]=A[temp-1]; 
            A[temp-1]=-temp; 
            i--; 
        }
        for(int i=0; i<A.length; i++)
        {
            if(A[i]!=-(i+1))
            return i+1; 
        }
        return length;
    }
}
