public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=s1.length(); 
        int n=s2.length(); 
        if((m+n)!=s3.length()) return false; 
        boolean [][] checker=new boolean [m+1][n+1];
        checker[0][0]=true; 
        for(int i=0; i<m; i++)
        {
            if(s1.charAt(i)==s3.charAt(i))
            {
                checker[i+1][0]=true; 
            }else break; 
        }
        for(int i=0; i<n; i++)
        {
            if(s2.charAt(i)==s3.charAt(i))
            {
                checker[0][i+1]=true; 
            }else break; 
        }
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
              if(checker[i][j-1]&&s3.charAt(i+j-1)==s2.charAt(j-1)) checker[i][j]=true; 
              else if (checker[i-1][j]&&s3.charAt(i+j-1)==s1.charAt(i-1)) checker[i][j]=true;;
            }
        }
        return checker[m][n];
    }
}
