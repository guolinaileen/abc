public class Solution
{
public static void main(String[] args) {
  	// TODO Auto-generated method stub
		TreeNode a=new TreeNode(0);
		TreeNode b=new TreeNode(20);
		TreeNode c=new TreeNode(9);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(12);
		TreeNode f=new TreeNode(7);
		a.left=b; 
		a.right=c; 
		c.left=d; 
		c.right=e; 
		d.left=f; 
		System.out.println(a.val);
		printLeftTree(a.left, true); 
		printRightTree(a.right, true);
	}
	
	static void printRightTree(TreeNode root, boolean print)
	{
		if(root==null) return ; 
		printRightTree(root.left, root.right==null? print: !print);
		printRightTree(root.right, print);
		if(print || (root.left==null && root.right==null)) System.out.println(root.val);
	}
  static void printLeftTree(TreeNode root, boolean print)
  {
    if(root==null) return ;
    if(print || (root.left==null && root.right==null)) System.out.println(root.val);
    printLeftTree(root.left, print);
    printLeftTree(root.right, root.left==null? print:!print);
  }
}
