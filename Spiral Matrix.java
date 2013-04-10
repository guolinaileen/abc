public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>(); 
        if(matrix.length==0) return result; 
       spiral(result,0, matrix.length-1, 0,  matrix[0].length-1,  matrix); 
       return result; 
    }
    void spiral(ArrayList<Integer> result, int upBound, int downBound, int leftBound, int rightBound, int [][] matrix)
    {
        if(upBound>downBound || leftBound>rightBound) return ;
        for(int i=leftBound; i<=rightBound; i++)
        {
            result.add(matrix[upBound][i]);
        }
        upBound++; 
        if(upBound>downBound) return ;
        for(int i=upBound; i<=downBound; i++)
        {
            result.add(matrix[i][rightBound]);
        }
        rightBound--; 
        if(rightBound<leftBound) return ;
        for(int i=rightBound; i>=leftBound; i--)
        {
            result.add(matrix[downBound][i]);
        }
        downBound--; 
        if(downBound<upBound) return ;
        for(int i=downBound; i>=upBound; i--)
        {
            result.add(matrix[i][leftBound]);
        }
        leftBound++; 
        spiral(result, upBound, downBound, leftBound,  rightBound,  matrix);
    }
}
