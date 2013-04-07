public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=A.length; 
        if(length==0) return 0; 
        int []T=new int[length];
        T[A.length-1]=0; 
        for(int i=A.length-2; i>=0; i--)
        {
            if(A[i]==0) 
            {
                T[i]=length; continue; 
            }
            T[i]=1+findMin(T, i+1, A[i]+i); 
        }
        return T[0]; 
    }
    int findMin(int [] T, int start, int end)
    {
        if(end>=T.length-1) return 0; 
        int min=T.length; 
        for(int i=start; i<=end; i++)
        {
            if(T[i]<min) min=T[i];
        }
        return min; 
    }
}
