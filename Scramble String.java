/*
check[i][j][n] s1 starts from i, s2 starts from j and the length is n
check[i][j][m] &&  check[i+m][j+m][n-m]
check[i][j+n-m][m] && check[i+m][j][n-m]  1<m<n
*/
public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s1.length()!=s2.length()) return false; 
        if(s1.equals(s2)) return true; 
        /*
        scramble string 3D check
        the first parameter is the starting point of s1, 
        the second parameter is the starting point of s2, 
        the third parameter is the length of the string
        */
        boolean [][][]check=new boolean [s1.length()][s2.length()][s1.length()+1];
        for(int i=s1.length()-1; i>=0; i--)
        {
            for(int j=s2.length()-1; j>=0; j--)
            {
                check[i][j][0]=true; 
                check[i][j][1]=s1.charAt(i)==s2.charAt(j);
            }
        }
        
        for(int i=s1.length()-1; i>=0; i--)
        {
            for(int j=s2.length()-1; j>=0; j--)
            {
                for(int n=2; n<=Math.min(s1.length()-i, s2.length()-j); n++)
                {
                    for(int m=1; m<n; m++)
                    {
                        check[i][j][n]|=(check[i][j][m]&&check[i+m][j+m][n-m])||(check[i][j+n-m][m]&&check[i+m][j][n-m]);
                        if(check[i][j][n]) break;
                    }
                }
            }
        }
        return check[0][0][s1.length()];   
    }
}
