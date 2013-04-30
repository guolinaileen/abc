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
		inOrderTranverse(a);
	}
	
	static void inOrderTranverse(TreeNode root)
	{
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(root!=null || !stack.isEmpty())
		{
			if(root!=null)
			{
				System.out.println(root.val);
				stack.push(root.right);
				root=root.left;
			}else
			{
				root=stack.pop(); 
			}
		}
	}
}
