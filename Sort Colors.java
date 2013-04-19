public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return ;
        int i=0, j=A.length-1;
        while(i<A.length)
        {
            if(A[i]!=0) break;
            i++;
        }
        while(j>=0)
        {
            if(A[j]!=2) break;
            j--;
        }
        for(int k=i; k<=j; k++)
        {
            if(A[k]==1) continue;
            if(A[k]==0 && k>i)
            {
                int temp=A[i]; 
                A[i]=A[k];
                A[k]=temp;
                while(i<A.length)
                {
                    if(A[i]!=0) break;
                    i++;
                }
                k--; 
            }else if(A[k]==2 && k<j)
            {
                int temp=A[j];
                A[j]=A[k];
                A[k]=temp;
                while(j>=0)
                {
                    if(A[j]!=2) break;
                    j--;
                }
                k--;
            }
        }
    }
}
