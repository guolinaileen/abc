public class Solution {
    public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int [][]matrix=new int [n][n]; 
        generate(matrix, 1, 0, n-1,0, n-1 ); 
        return matrix;        
    }
    void generate(int [][]matrix, int num, int up, int down, int left, int right )
    {
        if(up>down || left>right) return ;
        for(int i=left; i<=right ; i++ )
        {
            matrix[up][i]=num; 
            num++;
        }
        up++; 
        if(up>down) return ;
        for(int i=up; i<=down; i++)
        {
            matrix[i][right]=num; 
            num++; 
        }
        right--; 
        if(left>right) return ;
        for(int i=right; i>=left ; i--)
        {
            matrix[down][i]=num; 
            num++; 
        }
        down--; 
        if(up>down) return ;
        for(int i=down; i>=up; i--)
        {
            matrix[i][left]=num;
            num++; 
        }
        left++; 
        generate(matrix, num,  up,  down,  left, right ); 
    }
}
