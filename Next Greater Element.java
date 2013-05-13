//http://www.geeksforgeeks.org/next-greater-element/

public static void nextGreaterElement(int [] array)
  {
		if(array.length==0) return ;
		int [] nextArray=new int[array.length];
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(0);
		int index=1; 
		while(index!=array.length)
		{
			if(!stack.isEmpty())
			{
				int top=stack.peek();
				if(array[index]>array[top])
				{
					nextArray[top]=array[index];
					stack.pop();
				}else
				{
					stack.push(index);
					index++; 
				}
			}else
			{
				stack.push(index);
				index++; 
			}
		}
		while(!stack.isEmpty())
		{
			nextArray[stack.pop()]=-1; 
		}
		for(int i=0; i<array.length; i++)
		{
			System.out.println(nextArray[i]);
		}
	}
