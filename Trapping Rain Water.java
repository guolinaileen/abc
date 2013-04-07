public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length<=1) return 0; 
        int []left=new int [A.length];
        left[0]=A[0];
        for(int i=1; i<A.length; i++)
        {
            if(left[i-1]>A[i])
            left[i]=left[i-1];
            else
            left[i]=A[i]; 
        }
        int [] right=new int [A.length];
        right[A.length-1]=A[A.length-1];
        for(int i=A.length-2; i>=0; i--)
        {
            if(A[i]<right[i+1])
            right[i]=right[i+1]; 
            else
            right[i]=A[i];
        }
        int result=0; 
        for(int i=0; i<A.length; i++)
        {
            result+=Math.min(left[i], right[i])-A[i];
        }
        return result; 
    }
}
