public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(word.length()==0) return true; 
        if(board.length==0) return false; 
        boolean [][] check=new boolean [board.length][board[0].length];
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    check[i][j]=true; 
                    if(find(board, check, word.substring(1), i, j)) return true;
                    check[i][j]=false;
                }
            }
        }
        return false;
    }
    boolean find(char[][]board, boolean [][]check, String word, int i, int j)
    {
        if(word.length()==0) return true; 
        boolean result=false; 
        if(j+1< check[0].length && check[i][j+1]==false && board[i][j+1]==word.charAt(0))
        {
            check[i][j+1]=true; 
            result=find(board, check, word.substring(1), i, j+1);
            check[i][j+1]=false; 
        }
        if(result) return true; 
        if(j-1>=0 && check[i][j-1]==false && board[i][j-1]==word.charAt(0))
        {
            check[i][j-1]=true;
            result=find(board, check, word.substring(1), i, j-1);
            check[i][j-1]=false;
        }
        if(result) return true; 
        if(i+1< check.length && check[i+1][j]==false && board[i+1][j]==word.charAt(0))
        {
            check[i+1][j]=true; 
            result=find(board, check, word.substring(1), i+1, j);
            check[i+1][j]=false; 
        }
        if(result) return true; 
        if(i-1>=0 && check[i-1][j]==false && board[i-1][j]==word.charAt(0))
        {
            check[i-1][j]=true;
            result=find(board, check, word.substring(1), i-1, j);
            check[i-1][j]=false;
        }
        return result; 
    }
}
