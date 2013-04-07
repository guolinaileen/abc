public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=A.length;
        if(length==0) return true; 
        for(int i=0; i<length; )
        {
           int counter=A[i];
           if(i+counter>=length-1) return true;
           while(counter!=0)
           {           
              if(A[i+counter]==0) counter--; 
              else break; 
           }
           if(counter==0) return false; 
           i=i+counter; 
        }
        return false; 
    }

}
