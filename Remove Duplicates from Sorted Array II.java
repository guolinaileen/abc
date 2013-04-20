public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length<=2) return A.length; 
     int count=1; 
     int start=1;
     for(int i=1; i<A.length; i++)
     {
         if(A[i]==A[i-1])
         {
             if(count<2)
             {
             A[start]=A[i];
             start++; 
             count++; 
             }
         }else
         {
             count=1; 
             A[start]=A[i]; 
             start++; 
         }
     }
     return start>=A.length? A.length: start;
    }
}
