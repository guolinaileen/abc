public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int length=A.length; 
        if(length<=1) return 0; 
        int max=0; 
        int start=0, end=0; 
        int tempMax=0; 
        int counter=0; 
        while(max<A.length-1)
        {
            for(int i=start; i<=end; i++)
            {
                tempMax=Math.max(tempMax, A[i]+i);
            }
            start=end+1; 
            end=tempMax;
            if(tempMax>max) max=tempMax; 
            else return -1; 
            counter++; 
        }
        return counter; 
    }

}

/*
anotehr solution
*/

public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0||A.length==1) return 0;
        int max=0; 
        int index=0;
        int count=0;
        while(index<A.length)
        {
            int tempMax=0;
            for(int i=index; i<=max; i++)
            {
                tempMax=Math.max(tempMax, i+A[i]);
            }
            if(tempMax>=A.length-1) return count+1; 
            if(tempMax<max)
            {
                return -1;
            }
            index=max+1; 
            max=tempMax; 
            count++; 
        }
        return -1; 
    }
}
