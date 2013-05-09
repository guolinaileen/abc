  public static void doubleTree(TreeNode root)
	{
		if(root==null) return ;
		TreeNode newNode=new TreeNode(root.val);
		TreeNode left=root.left; 
		root.left=newNode;
		newNode.left=left; 
		doubleTree(left);
		doubleTree(root.right);
	}
