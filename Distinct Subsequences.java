/*
f(i, j) = f(i+1, j) + (S[i] == T[j]) * f(i+1, j+1).
*/
public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=S.length();
        int m=T.length(); 
        if(n<m) return 0; 
        int [] C=new int[m+1];
        C[m]=1; 
        for(int i=n-1; i>=0; i-- )
        {
            for(int j=0; j<m; j++)
            {
                if(S.charAt(i)==T.charAt(j))
                C[j]+=C[j+1];
            }
        }
        return C[0];
    }
}
