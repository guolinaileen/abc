public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0; 
        int index=0; 
        for(int i=1; i<A.length; i++)
        {
            if(A[i]!=A[index])
            {
                index++; 
                A[index]=A[i]; 
            }            
        }
        if(index==A.length-1) return A.length;
        index++; 
        A[index]='\0';
        return index; 
    }
}
