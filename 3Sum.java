public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        if(num.length<3) return result; 
        Arrays.sort(num);
        for(int i=0; i<=num.length-3; i++)
        {
            if(i!=0 && num[i]==num[i-1]) continue; 
            int sum=-num[i]; 
            int start=i+1, end=num.length-1;  
            while(start<end)
            {
                int temp=num[start]+num[end];
                if(temp==sum)
                {
                    ArrayList<Integer> list=new ArrayList<Integer>(); 
                    list.add(num[i]);
                    list.add(num[start]);
                    list.add(num[end]);
                    result.add(list);
                    start++; 
                    while(start<end && num[start]==num[start-1])
                    {
                        start++; 
                    }
                    end--; 
                    while(start<end && num[end]==num[end+1])
                    {
                        end--; 
                    }
                }else if(temp>sum)
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
