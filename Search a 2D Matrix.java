public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
     if(matrix.length==0) return false;
     int m=matrix.length;
     int n=matrix[0].length;
     int i=0, j=matrix[0].length-1;
     while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length)
     {
         if(matrix[i][j]==target) return true; 
         if(matrix[i][j]>target) j--; 
         else i++;
     }
     return false; 
    }
}
