  public static boolean checkSum(TreeNode root)
	{
		if(root==null|| (root.left==null && root.right==null) ) return true;
		int left=(root.left==null? 0: root.left.val);
		int right=(root.right==null? 0: root.right.val);
		if(root.val!=(left+right)) return false; 
		return checkSum(root.left)&&checkSum(root.right);
	}
