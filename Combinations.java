public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(n<k||n<1||k<1) return result;
        ArrayList<Integer> list=new ArrayList<Integer>();
        findNumber(n, k, 1, list, result );
        return result;
    }
    void findNumber(int n, int k, int c, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> comb)
    {
        if(k==0)
        {
            comb.add(list);
            return; 
        }
        if(c>n) return ;
        findNumber(n, k, c+1, list, comb);
        ArrayList<Integer> alist=new ArrayList<Integer>(list);
        alist.add(c);
        findNumber(n, k-1, c+1, alist, comb);
    }

}
