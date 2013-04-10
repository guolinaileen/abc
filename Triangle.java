public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(triangle.size()==0) return Integer.MAX_VALUE;
        ArrayList<Integer> list=triangle.get(triangle.size()-1);
        for(int i=triangle.size()-2; i>=0 ; i--)
        {
            for(int j=0; j<=i; j++)
            {
                int val=triangle.get(i).get(j)+Math.min(list.get(j), list.get(j+1));
                list.remove(j);
                list.add(j, val);
            }
        }
        return list.get(0);
    }
}
