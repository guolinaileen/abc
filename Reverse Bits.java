// Type your Java code and click the "Run Code" button!
// Your code output will be shown on the left.
// Click on the "Show input" button to enter input data to be read (from stdin).

public class Interpreter {
    public static void main(String[] args) {
        // Start typing your code here...
        System.out.println(reverse(14));
    }
    public static int reverse(int x)
    {
        int y=x; 
        int count=1;
        while(y/2!=0)
        {
            count++; 
            y=y/2;
        }
        for(int i=0; i<count/2; i++)
        {
            x=swap(x, i, count-i-1 );
        }
        return x; 
    }
    public static int swap(int x, int i, int j )
    {
        int left=((x>>i) & 1); 
        int right=((x>>j) & 1);
        if(left!=right)
        {
            x^=(1<<i | 1<<j ) ;
        }
        return x; 
    }
}
