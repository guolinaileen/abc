//http://www.geeksforgeeks.org/maximum-length-bitonic-subarray/

public static int findTheBit(int [] array)
	{
		if(array.length==0) return 0; 
		int [] incrArray=new int[array.length];
		incrArray[0]=1; 
		for(int i=1; i<array.length; i++)
		{
			if(array[i]>array[i-1])
			{
				incrArray[i]=incrArray[i-1]+1;
			}else
			{
				incrArray[i]=1; 
			}
		}
		int [] desArray=new int[array.length];
		desArray[array.length-1]=1; 
		for(int i=array.length-2; i>=0; i--)
		{
			if(array[i]>array[i+1])
			{
				desArray[i]=desArray[i+1]+1; 
			}else
			{
				desArray[i]=1;
			}
		}
		int maxLength=0; 
		for(int i=0; i<array.length; i++)
		{
			maxLength=Math.max(maxLength, incrArray[i]+desArray[i]-1);
		}
		return maxLength; 
	}
