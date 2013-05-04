public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>(); 
        ArrayList<Integer> subResult=new ArrayList<Integer>();
        Arrays.sort(num);
        solve(result, num, 0, target, -1,  subResult );  
        return result;
    }
    void solve(ArrayList<ArrayList<Integer>> result, int[] num, int sum, int target, int index, ArrayList<Integer> subResult )
    {
        if(sum>target) return ;
        if(sum==target)
        {
            result.add(new ArrayList<Integer>( subResult ));
        }
        for(int i=index+1; i<num.length; i++)
        {
            if(i!=index+1 && num[i]==num[i-1]) continue; 
            subResult.add(num[i]);
            solve(result, num, sum+num[i], target, i, subResult );
            subResult.remove(subResult.size()-1);
        }
    }
}
