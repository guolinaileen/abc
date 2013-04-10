public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n==0)
        {
            return; 
        }        
        if(m==0)
        {
            n--; 
            while(n>=0)
            {
                A[n]=B[n]; n--; 
            }
            return; 
        }

        int start=m+n-1; m--; n--; 
        while(m>=0 && n>=0 )
        {
            if(A[m]>B[n]) 
            {
                A[start]=A[m]; start--; m--;
            }else
            {
                A[start]=B[n]; start--; n--; 
            }
        }
        while(n>=0)
        {
            A[start]=B[n];
            start--; 
            n--; 
        }
    }
}
