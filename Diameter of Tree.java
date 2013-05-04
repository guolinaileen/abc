public class Solution
{
public static int maxNum;
public static void main(String[] args)
{
    TreeNode a=new TreeNode(0);
  	TreeNode b=new TreeNode(20);
		TreeNode c=new TreeNode(9);
		TreeNode d=new TreeNode(4);
		TreeNode e=new TreeNode(12);
		TreeNode f=new TreeNode(7);
		TreeNode g=new TreeNode(6);
		TreeNode h=new TreeNode(5);
		a.left=b; 
		a.right=c; 
		c.left=d; 
		c.right=e; 
		d.left=f; 
		b.left=g; 
		g.left=h;

    maxNum=0; 
  	diameter(a);
		System.out.println(maxNum);
}
static int diameter(TreeNode root)
  {
		if(root==null) return 0; 
		int left=diameter(root.left);
		int right=diameter(root.right);
		if(left+right+1>maxNum)
		{
			maxNum=left+right+1;
		}
		return 1+Math.max(left, right);
	}

}
