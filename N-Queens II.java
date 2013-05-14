public class Solution {
    int counter; 
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        counter=0; 
        int []row=new int[n];
        placeQueue(row, 0 );
        return counter; 
    }
     void placeQueue(int []row, int rowLine )
    {
        if(rowLine==row.length)
        {
            counter++;  return ;
        }
        for(int i=0; i<row.length; i++)
        {         
            if(validQueue(row, rowLine, i))
            {
                row[rowLine]=i;
                placeQueue(row, rowLine+1); 
            }
        }
    }
    boolean validQueue(int [] row, int rowLine, int col)
    {
        for(int i=0; i<rowLine; i++)
        {
            if(row[i]==col) return false; 
        }
        for(int i=0; i<rowLine; i++)
        {
            if(Math.abs(i-rowLine)==Math.abs(row[i]-col)) return false; 
        }
        return true; 
    }
}
