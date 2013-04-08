public class Solution {
    public int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [] arrays=new int[n+1];
        return numT(n, arrays);
    }
    int numT(int n, int [] arrays)
    {
        if(n==0 )
        {
            arrays[n]=1; 
            return arrays[n]; 
        }
        if(arrays[n]!=0) return arrays[n]; 
        int sum=0; 
        for(int i=0; i<n; i++)
        {
            sum+=numT(i, arrays)*numT(n-i-1, arrays);
        }
        arrays[n]=sum; 
        return arrays[n];
    }
}
