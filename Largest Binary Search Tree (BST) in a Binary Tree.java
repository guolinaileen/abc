public class Solution
{
public static Result maxResult; 
  static class TreeNode
  {
		int val; 
		TreeNode left; 
		TreeNode right;
		TreeNode(int value)
		{
			val=value; 
			left=null; 
			right=null; 
		}
	}
	static class Result
	{
		TreeNode child; 
		int num; 
		Result(int n)
		{
			num=n; 
			child=null; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a=new TreeNode(0);
		a.left=new TreeNode(5);
		a.right=new TreeNode(1);
		maxResult=new Result(Integer.MIN_VALUE);
		maxResult.child=null; 
		Result result=findLargestBST(a, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(maxResult.num);
	}
	
    static Result findLargestBST(TreeNode root, int min, int max)
    {
        if(root==null)
        {
        	Result r=new Result(0);
        	return r; 
        }
        if(root.val>min && root.val<max)
        {
            Result left=findLargestBST(root.left, min, root.val);
            TreeNode leftChild=left.child;
            Result right=findLargestBST(root.right, root.val, max);
            TreeNode rightChild=right.child;
            TreeNode parent=new TreeNode(root.val);
            parent.left=leftChild;
            parent.right=rightChild;
            int total=left.num+right.num+1;
            if(total>maxResult.num)
            {
            	maxResult=new Result(total);
            	maxResult.child=parent;
            }
            Result result=new Result(total);
            result.child=parent; 
            return result; 
        }else
        {
        	findLargestBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        	Result result=new Result(0);
        	return result; 
        }
    }

}
