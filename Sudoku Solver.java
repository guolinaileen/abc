public class Solution {
    public boolean solveSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return  validSudoku(board); 
    }
    boolean validSudoku(char[][]board)
    {
        boolean row[][]=new boolean [board.length][board[0].length];
        boolean col[][]=new boolean [board.length][board[0].length];
        boolean dir[][]=new boolean [board.length][board[0].length];
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
               if(board[i][j]!='.')
               {
                   int c=board[i][j]-'1'; 
                   if(row[i][c]||col[j][c]||dir[i-i%3+j/3][c]) return false; 
                   row[i][c]=true; 
                   col[j][c]=true; 
                   dir[i-i%3+j/3][c]=true; 
               }else
               {
                   for(char z='1'; z<='9'; z++)
                    {
                        board[i][j]=z; 
                        if(validSudoku(board)) return true; 
                        board[i][j]='.'; 
                    }
               }
            }
        }
        return true; 
    }
}
