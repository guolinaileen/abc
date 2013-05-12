  public static void printBSTkeys(TreeNode current, int min, int max)
	{
		if(current==null) return ; 
		if(current.val<min) printBSTkeys(current.right, min, max);
		else if(current.val>max) printBSTkeys(current.left, min, max);
		else 
		{
			System.out.println(current.val);
			printBSTkeys(current.left, min, max);
			printBSTkeys(current.right, min, max);
		}
	}
