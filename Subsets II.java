public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
         ArrayList<ArrayList<Integer>> result=new  ArrayList<ArrayList<Integer>>(); 
         ArrayList<Integer> list=new ArrayList<Integer>();
         result.add(list);
         Arrays.sort(num);
         int start=0; 
         for(int i=0; i<num.length; i++)
         {
             int size=result.size();
             for(; start<size; start++)
             {
                 ArrayList<Integer> subList=new ArrayList(result.get(start));
                 subList.add(num[i]);
                 result.add(subList);
             }
             if(i+1<num.length && num[i]==num[i+1])
             {
                 start=size;
             }else
             {
                 start=0; 
             }
         }
         return result; 
    }
}
/*
if we meet dup values, we start from the previous starting point
e.g. [1, 1, 2, 2]
[]  [1]
    [1, 1]
[2] [1, 2]  [1, 1, 2]
[2, 2]  [1, 2, 2]   [1, 1, 2, 2]
*/
