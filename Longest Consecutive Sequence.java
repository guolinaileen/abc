import java.util.*; 
public class Solution {
public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashSet<Integer> set=new HashSet<Integer>();
        int max=0; 
        for(int i=0; i<num.length; i++)
        {
            set.add(num[i]);
        }
        for(int i=0; i<num.length;i++)
        {
            if(set.contains(num[i]))
            {
                int count1=0, count2=0; 
                while(set.contains(num[i]+1+count1))
                {
                    set.remove(num[i]+1+count1);
                    count1++; 
                }
                while(set.contains(num[i]-1-count2))
                {
                    set.remove(num[i]-1-count2);
                    count2++; 
                }
               max=Math.max(max, count1+count2+1);
               set.remove(num[i]);
            }
        }      
        return max; 
    }
}
