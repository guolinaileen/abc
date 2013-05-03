public class Solution
{
public static int maxNum; 
public static void main(String[] args)
{

  	TreeNode aa=new TreeNode(40);
		TreeNode bb=new TreeNode(20);
		TreeNode cc=new TreeNode(70);
		TreeNode dd=new TreeNode(6);
		TreeNode ee=new TreeNode(23);
		TreeNode ff=new TreeNode(45);
		TreeNode gg=new TreeNode(79);
		TreeNode hh=new TreeNode(72);
		
		aa.left=bb; aa.right=cc; 
		bb.left=dd; bb.right=ee;
		cc.left=ff; cc.right=gg;
		gg.left=hh; 

		maxNum=0; 
		TreeNode resultK=findKLargest(aa, 6);
		System.out.println(resultK.val);
}

  static TreeNode findKLargest(TreeNode root, int k)
	{
		if(root==null) return null; 
		TreeNode right=findKLargest(root.right, k);
		if(right!=null) return right; 
		maxNum++; 
		if(maxNum==k) return root; 
		TreeNode left=findKLargest(root.left, k);
		if(left!=null) return left; 
		return null; 
	}

}
