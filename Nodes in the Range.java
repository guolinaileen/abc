  public static int maxNum=0; 
  public static void sumRange(TreeNode root, int max, int min)
	{
		if(root==null) return ;
		if(root.val<=max && root.val>=min )
		{
			maxNum++; 
			sumRange(root.left,  max,  min); 
			sumRange(root.right, max,  min); 
		}else if(root.val<min)
		{
			sumRange(root.right, max, min);
		}else
		{
			sumRange(root.left, max, min);
		}
	}
