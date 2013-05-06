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
		preOrderTranverse(a);
		inOrderTranverse(a); 
		postOrderTranverse(a);
	}
	
	static void preOrderTranverse(TreeNode root)
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
	
	static void inOrderTranverse(TreeNode root)
	{
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(root!=null || !stack.isEmpty())
		{
			if(root!=null)
			{
				stack.push(root);
				root=root.left; 
			}else
			{
				root=stack.pop();
				System.out.println(root.val);
				root=root.right; 
			}
		}
	}
	static void postOrderTranverse(TreeNode root)
	{
		if(root==null) return;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(root);
		TreeNode prevNode=null; 
		while(!stack.isEmpty())
		{
			TreeNode curNode=stack.peek();
			if(prevNode==null || prevNode.left==curNode || prevNode.right==curNode)
			{
				if(curNode.left!=null)
					stack.push(curNode.left);
				else if(curNode.right!=null)
					stack.push(curNode.right);
			}else if(curNode.left==prevNode)
			{
				if(curNode.right!=null)
					stack.push(curNode.right);
			}else
			{
				System.out.println(curNode.val);
				stack.pop(); 
			}
			prevNode=curNode;
		}
	}

}
