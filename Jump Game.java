public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max=0; 
        int index=0;
        int start=0; 
        while(max<A.length-1)
        {
            int tempMax=0; 
            for(int i=start; i<=max; i++)
            {
                tempMax=Math.max(tempMax, A[i]+i);
            }
            if(tempMax<=max) return false; 
            start=max+1; 
            max=tempMax; 
        }
        return true; 
    }
}
