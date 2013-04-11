public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(grid.length==0) return 0; 
     int [][] arrays=new int [grid.length+1][grid[0].length+1];   
     
     return find(grid, arrays,0, 0);
     
    }
    int find(int [][] grid, int [][] arrays, int m, int n)
    {
        if(m==grid.length-1 && n==grid[0].length) return 0; 
        if(arrays[m][n]!=0) return arrays[m][n];
        if(m==grid.length-1)
        {
            arrays[m][n]=grid[m][n]+find(grid, arrays, m, n+1);
            return arrays[m][n];
        }
        if(n==grid[0].length-1)
        {
            arrays[m][n]=grid[m][n]+find(grid, arrays,m+1, n);
            return arrays[m][n];
        }
        arrays[m][n]=grid[m][n]+Math.min(find(grid, arrays, m, n+1), find(grid, arrays,m+1, n));
        return arrays[m][n];
}

}
