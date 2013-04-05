public class Solution {
    double medianOfThree(int a, int b, int c)
    {
        int min=Math.min(a, Math.min(b, c));
        int max=Math.max(a, Math.max(b, c));
        return (a+b+c-min-max);
    }
    double medianOfFour(int a, int b, int c, int d)
    {
        int min=Math.min(Math.min(a, b), Math.min(c, d));
        int max=Math.max(Math.max(a, b), Math.max(c, d));
        return (a+b+c+d-min-max)/2.0; 
    }
    public double findMedianSortedArrays(int A[], int B[]) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) 
        {
            if(B.length%2==0) return (B[B.length/2]+B[B.length/2-1])/2.0; 
            return B[B.length/2];
        }
        if(B.length==0)
        {
            if(A.length%2==0) return (A[A.length/2]+A[A.length/2-1])/2.0; 
            return A[A.length/2];
        }
        if(A.length<=B.length)
        {
            return findMedian(A, 0, A.length-1, B, 0, B.length-1); 
        }
        return findMedian(B, 0, B.length-1, A, 0, A.length-1);
    }
    double findMedian(int A[], int startA, int endA, int B[], int startB, int endB)
    {
           if(startA==endA) //one element in A
            {
           if(startB==endB)//one element in B
	         {
	             return (A[startA]+B[startB])/2.0; 
	         }
	         if((endB-startB)%2==1) //even elements in B
	         {
	             return medianOfThree(B[(endB+startB)/2],B[(endB+startB)/2+1], A[startA]); 
	         }
	         if((endB-startB)%2==0) //odd elements in B
	         {
	             return medianOfFour(B[(endB+startB)/2],B[(endB+startB)/2-1],B[(endB+startB)/2+1], A[startA]);
	         }
	        }
	        if(endA-startA==1) //two elements in A
	        {
	            if(endB-startB==1) //two elements in B
	            {
	                return medianOfFour(A[startA], A[endA], B[startB], B[endB]);
	            }
	            if((endB-startB)%2==1) //even elements in B
	            {
	                return medianOfFour(Math.min(A[startA], B[(endB+startB)/2+2] ), Math.max(A[endA], B[(endB+startB)/2-1]), B[(endB+startB)/2],B[(endB+startB)/2+1]);
	            }
	            if((endB-startB)%2==0) //odd elements in B
	            {
	                return medianOfThree(Math.min(A[startA],  B[(endB+startB)/2+1] ), Math.max(A[endA], B[(endB+startB)/2-1]), B[(endB+startB)/2]);
	            }
	        }
	        int midA=(endA+startA)/2; 
	        int midB=(endB+startB)/2;
	        int remove=0; 
	        if(A[midA]<B[midB])
	        {
                if((endB-startB)%2==1) //even elements in B
	            {
	                midB++; 
	            } 
	            remove=Math.min((midA-startA), (endB-midB));
	            
	            return findMedian(A, startA+remove, endA, B, startB, endB-remove);
	        }else 
	        {
               if((endA-startA)%2==1) //even elements in A
	            {
	                midA++; 
	            } 
	            remove=Math.min((endA-midA), (midB-startB));
	            return findMedian(A, startA, endA-remove, B, startB+remove, endB);
	        }
        
    }
}
