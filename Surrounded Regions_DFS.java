public class Solution {
    public void solve(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board.length==0) return ; 
        for(int i=0; i<board[0].length; i++)
        {
            process(board, 0, i);
            process(board, board.length-1, i);
        }
        for(int i=0; i<board.length; i++)
        {
            process(board, i, 0);
            process(board, i, board[0].length-1);
        }
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j]=='D') board[i][j]='O'; 
                else if(board[i][j]=='O') board[i][j]='X';
            }
        }
    }
    void process(char[][] board, int i, int j)
    {
        if(i<0|| j<0 || i>=board.length||j>=board[0].length||board[i][j]!='O') return ; 
        board[i][j]='D'; 
        process(board, i+1, j);
        process(board, i-1, j);
        process(board, i, j+1);
        process(board, i, j-1);
    }
}
