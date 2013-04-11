public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
     if(obstacleGrid.length==0) return 0; 
     int [][]P=new int[obstacleGrid.length][obstacleGrid[0].length];
     return find(P, obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1);
    }
    int find(int [][]P, int [][] obstacleGrid, int m, int n)
    {
        if(obstacleGrid[m][n]==1) return 0; 
        if(m==0 && n==0) return 1; 
        if(P[m][n]!=0) return P[m][n];
        int c1=0; 
        if(m>0) c1=find(P, obstacleGrid, m-1, n);
        int c2=0; 
        if(n>0) c2=find(P, obstacleGrid, m, n-1);
        P[m][n]=c1+c2;
        return P[m][n];
    }
}
