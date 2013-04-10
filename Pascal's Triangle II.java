public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(rowIndex<0) return result; 
        result.add(1); 
        for(int i=0; i<rowIndex; i++)
        {
            ArrayList<Integer> subResult=new ArrayList<Integer>();
            subResult.add(1);
            for(int j=0; j<result.size()-1; j++)
            {
                subResult.add(result.get(j)+result.get(j+1));
            }
            subResult.add(1);
            result=subResult;
        }
        return result; 
    }
}
