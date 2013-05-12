  public static void printAncestor(TreeNode current, int target, ArrayList<Integer> ancestor)
	{
		if(current==null) return ;
		if(current.val==target)
		{
			for(int i=ancestor.size()-1; i>=0; i--)
			{
				System.out.println(ancestor.get(i));
			}
			return ; 
		}
		ancestor.add(current.val);
		printAncestor(current.left, target,  ancestor); 
		printAncestor(current.right, target,  ancestor);
		ancestor.remove(ancestor.size()-1);		
	}
