//http://www.geeksforgeeks.org/find-the-maximum-sum-path-in-a-binary-tree/
  	int maxNum=Integer.MIN_VALUE; 
		ArrayList<Integer> resultList=new ArrayList<Integer>();
		ArrayList<Integer> nodes=new ArrayList<Integer>();
		findPath(aa, 0 , nodes); 
		for(int i=0; i<resultList.size(); i++)
		{
			System.out.println(resultList.get(i));
		}
public static void findPath(TreeNode head, int num ,ArrayList<Integer> nodes)
	{ 
		if(head==null)
		{
			if(maxNum<num)
			{
				maxNum=num; 
				resultList=new ArrayList<Integer>(nodes);
				}
			return ;
		}
		nodes.add(head.val);
		findPath(head.left, num+head.val, nodes); 
		findPath(head.right, num+head.val, nodes);
		nodes.remove(nodes.size()-1);
	}
