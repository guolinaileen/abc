public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subResult=new ArrayList<Integer>();
        Arrays.sort(candidates);
        solve(result,  candidates, 0 ,  target, subResult, 0); 
        return result; 
    }
    
    void solve(ArrayList<ArrayList<Integer>> result, int[] candidates, int sum, int target, ArrayList<Integer> subResult, int prevIndx)
    {
        if(sum>target) return ; 
        if(sum==target)
        {
            result.add(new ArrayList<Integer>(subResult));
        }
        for(int i=prevIndx; i<candidates.length; i++)
        {
            //previous node can be added multiple times
            subResult.add(candidates[i]);
            solve(result, candidates, sum+candidates[i], target, subResult, i);
            subResult.remove(subResult.size()-1);
        }
    }
}
