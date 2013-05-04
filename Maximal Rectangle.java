public class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(matrix.length==0) return 0; 
        int [][] calMatrix=new int [matrix.length][matrix[0].length]; 
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]=='0')
                {
                    calMatrix[i][j]=0;
                }else
                {
                    calMatrix[i][j]=1+(j>0? calMatrix[i][j-1]: 0);
                }
            }
        }
        int result=0; 
        for(int j=0; j<matrix[0].length; j++)
        {
            for(int i=0; i<matrix.length; i++)
            {
                int num=calMatrix[i][j];
                for(int k=i; k<matrix.length; k++)
                {
                    num=Math.min(num, calMatrix[k][j] );
                    result=Math.max(result, num*(k-i+1));
                }
            }
        }
        return result; 
    }
}
