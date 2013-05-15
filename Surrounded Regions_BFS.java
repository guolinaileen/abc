public class Solution {
    Queue<Integer> queue=new LinkedList<Integer>();
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
    void check(char[][] board, int i, int j)
    {
        if(i<0|| j<0 || i>=board.length||j>=board[0].length||board[i][j]!='O') return ; 
        queue.offer(i*board[0].length+j);
        board[i][j]='D';
    }
    void process(char[][] board, int i, int j)
    {
        check(board, i,  j); 
        while(!queue.isEmpty())
        {
            int num=queue.poll();
            i=num/board[0].length;
            j=num%board[0].length;
            check(board, i+1, j);
            check(board, i-1, j);
            check(board, i, j+1);
            check(board, i, j-1);
        }

    }
}
