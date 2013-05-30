public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=A.length; 
        for(int i=0; i<length; )
        {
            if(A[i]==elem)
            {
                /*if the order doesn't matter, shorten the length directly*/
                A[i]=A[--length]; 
            }else
            {
                i++; 
            }
        }
        return length; 
    }
}

public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0; 
        int index=0; 
        int end=A.length-1;
        while(index<=end)
        {
            if(A[index]==elem)
            {
                A[index]=A[end]; 
                end--; 
            }else
            {
                index++; 
            }
        }
        return end+1; 
    }
}
