public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num.length==0) return ; 
        for(int i=num.length-1; i>0; i--)
        {
            if(num[i]>num[i-1])
            {
                for(int j=num.length-1; j>=i; j--)
                {
                    if(num[j]>num[i-1])
                    {
                        int temp=num[i-1]; 
                        num[i-1]=num[j]; 
                        num[j]=temp; 
                        break; 
                    }
                }
                reverse(num, i, num.length-1);
                return ; 
            }
        }
        reverse(num, 0, num.length-1); 
        
    }
    void reverse(int [] num, int start, int end)
    {
        while(start<end)
        {
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp; 
            start++; 
            end--; 
        }
    }
}
