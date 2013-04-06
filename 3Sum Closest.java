public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int result=num[0]+num[1]+num[num.length-1];
        for(int i=0; i<num.length; i++)
        {
            int start=i+1, end=num.length-1;
            while(start<end)
            {
                int sum=num[i]+num[start]+num[end];
                if(Math.abs(result-target)>Math.abs(sum-target))
                {
                    result=sum; 
                    if(result==target) return target; 
                }
                if(sum>target)
                {
                    end--; 
                }else
                {
                    start++; 
                }
            }
        }
        return result; 
        
    }
}
