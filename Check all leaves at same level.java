public static int maxNum=0;
public static boolean checkLevel(TreeNode root, int sum)
	{
		if(root==null) return true; 
		if(root.left==null && root.right==null)
		{
			if(maxNum==0) maxNum=sum+1; 
			else return maxNum==sum+1; 
		}
		return checkLevel(root.left, sum+1) &&  checkLevel(root.right, sum+1)  ; 
	}
