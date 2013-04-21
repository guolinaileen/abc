public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return permutation(num, 0); 
    }
     ArrayList<ArrayList<Integer>> permutation(int [] num, int index)
    {
        ArrayList<ArrayList<Integer>> subResult=new  ArrayList<ArrayList<Integer>>(); 
        if(index==num.length) 
        {
        subResult.add(new ArrayList<Integer>()); 
        return subResult; 
        }
        ArrayList<ArrayList<Integer>> result=permutation(num, index+1);
        for(ArrayList<Integer> list: result)
         {
             for(int i=0; i<=list.size(); i++)
             {
                 list.add(i, num[index]); 
                 subResult.add((ArrayList<Integer>) list.clone());
                 list.remove(i);
             }
         }
        return subResult; 
    }
}
