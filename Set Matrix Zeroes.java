public class Solution {
    public void setZeroes(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(matrix.length==0) return ;
        int i=0, j=0;
        boolean find=false;
        for(int p=0; p<matrix.length; p++)
        {
            for(int q=0; q<matrix[0].length; q++)
            {
                if(matrix[p][q]==0)
                {
                    find=true; 
                    i=p; j=q; 
                    break;
                }
            }
            if(find) break; 
        }
        if(!find) return; 
        for(int p=0; p<matrix.length; p++)
        {
            for(int q=0; q<matrix[0].length; q++)
            {
                if(matrix[p][q]==0)
                {
                    matrix[p][j]=0; matrix[i][q]=0;
                }
            }
        }        
        for(int q=0; q<matrix[0].length; q++)
        {
            if(q==j) continue; 
            for(int p=0; p<matrix.length; p++)
            {
                if(p==i) continue; 
                if(matrix[i][q]==0 ||matrix[p][j]==0 )
                {
                     matrix[p][q]=0;
                }
            }
        }
        for(int p=0; p<matrix.length; p++)
        {
            matrix[p][j]=0;
        }
        for(int q=0; q<matrix[0].length; q++)
        {
            matrix[i][q]=0;
        }
    }
}
