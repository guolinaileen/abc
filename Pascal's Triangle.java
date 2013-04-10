public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(numRows<=0) return result; 
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        result.add(list); 
        for(int i=1; i<numRows; i++)
        {
            ArrayList<Integer> subResult=new ArrayList<Integer>();
            subResult.add(1);
            ArrayList<Integer> preList=result.get(result.size()-1);
            for(int j=0; j<preList.size()-1; j++)
            {
                subResult.add(preList.get(j)+preList.get(j+1));
            }
            subResult.add(1);
            result.add(subResult);
        }
        return result; 
    }
}
