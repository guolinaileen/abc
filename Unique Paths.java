public class Solution {
    public int uniquePaths(int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [][]P=new int [m][n];
        P[0][0]=1; 
        return find(P, m-1, n-1);
    }
    int find(int [][]P, int m, int n)
    {
        if(m==0 && n==0) return 1; 
        if(P[m][n]!=0) return P[m][n] ;
        int c1=0; 
        if(m>0) c1=find(P, m-1, n);
        int c2=0; 
        if(n>0) c2=find(P, m, n-1);
        P[m][n]=c1+c2;
        return P[m][n];
    }
}
