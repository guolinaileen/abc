public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        Arrays.sort(num);
        combination(num, 0, target, 0, list, result ) ;
        return result; 
    }
    void combination(int [] candidates, int index,int target, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result )
    {
        if(sum>target) return ;
        if(sum==target)
        {
            result.add(new ArrayList<Integer>(list)); return ;
        }
        
        for(int i=index; i<candidates.length; i++)
        {
            if(i>index && candidates[i]==candidates[i-1]) continue; 
            list.add(candidates[i]);
            combination(candidates, i+1, target ,sum+candidates[i], list, result);
            list.remove(list.size()-1);
        }
    }
}
