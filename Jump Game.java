public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
      if(A.length==0) return false;   
      for(int i=0; i<A.length; )
      {
          int step=A[i];
          if(i+step>=A.length-1) return true; 
          int j=step; 
          for(; j>0; j--)
          {
              if(A[i+j]!=0)
              {
                  i=i+j; 
                  break; 
              }
          }
          if(j==0) return false; 
      }
      return true; 
    }
}
