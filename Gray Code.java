public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        int m=1<<n;
        for(int i=0; i<m ; i++)
        {
            result.add(i^(i>>1));
        }
        return result; 
    }
}
