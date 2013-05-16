public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int index=num.length-1; 
        if(index<=0) return; 
        while(index>0)
        {
            if(num[index]>num[index-1])
            {
                int right=num.length-1; 
                while(num[right]<=num[index-1])
                {
                    right--;
                }
                swap(num, index-1, right);
                reverse(num, index, num.length-1);
                break; 
            }
            index--; 
        }
        if(index==0) reverse(num, 0, num.length-1);
        
    }
    void reverse(int []num, int i, int j)
    {
        while(i<j)
        {
            swap(num, i, j);
            i++; 
            j--; 
        }
    }
    void swap(int [] num, int i, int j)
    {
        int temp=num[j];
        num[j]=num[i]; 
        num[i]=temp; 
    }
}
