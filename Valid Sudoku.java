public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean [][] col=new boolean [board.length][board.length];
        boolean [][] row=new boolean [board.length][board.length];
        boolean [][] block=new boolean [board.length][board.length];
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j]=='.') continue; 
                int c=board[i][j]-'1'; 
                if(col[j][c]||row[i][c]||block[i-i%3+j/3][c]) return false; 
                col[j][c]=row[i][c]=block[i-i%3+j/3][c]=true; 
            }
        }
        return true; 
    }
}
