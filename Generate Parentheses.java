public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result=new ArrayList<String>(); 
        if(n==0) return result; 
        generate(result, "", n, n);
        return result; 
    }
    void generate(ArrayList<String> result, String subResult, int left, int right)
    {
        if(left==0 && right==0)
        {
            result.add(subResult); return ; 
        }
        if(left>0)
        {
            generate(result, subResult+'(', left-1, right);
        }
        if(left<right && right>0)
        {
            generate(result, subResult+')', left, right-1);
        }
    }
}
