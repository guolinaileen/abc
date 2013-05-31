public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
      if(A.length<=2) return 0; 
      int [] first=new int[A.length];
      int [] second=new int[A.length];
      for(int i=0; i<A.length; i++)
      {
          if(i==0)
          {
          first[i]=A[i]; continue; 
          }
          first[i]=Math.max(first[i-1], A[i] );
      }
      for(int i=A.length-1; i>=0; i--)
      {
          if(i==A.length-1)
          {
          second[i]=A[i]; continue; 
          } 
          second[i]=Math.max(second[i+1], A[i] );
      }
      int max=0; 
      for(int i=0; i<A.length; i++)
      {
          max+=Math.min(first[i], second[i])-A[i];
      }
      return max;
    }
}
