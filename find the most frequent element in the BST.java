public class Solution
{
  public static int maxNum; 
	public static int maxNumValue; 
	public static int freq; 
	public static int freqValue; 

public static void main(String[] args)
{
  
		TreeNode aa=new TreeNode(40);
		TreeNode bb=new TreeNode(20);
		TreeNode cc=new TreeNode(70);
		TreeNode dd=new TreeNode(20);
		TreeNode ee=new TreeNode(20);
		TreeNode ff=new TreeNode(70);
		TreeNode gg=new TreeNode(79);
		TreeNode hh=new TreeNode(72);
		
		aa.left=bb; aa.right=cc; 
		bb.left=dd; bb.right=ee;
		cc.left=ff; cc.right=gg;
		gg.left=hh; 
		
		maxNum=1; 
		maxNumValue=aa.val; 
		freq=1; 
		freqValue=1; 
		
		findTheMostFrequentElement( aa ); 
		System.out.println(maxNum);
}

  static void findTheMostFrequentElement(TreeNode root)
	{
		if(root==null) return ; 
		findTheMostFrequentElement(root.left); 
		if(root.val!=freqValue)
		{
			freqValue=root.val; 
			freq=1; 
		}else
		{
			freq++; 
			if(freq>maxNum)
			{
				maxNum=freq; 
				maxNumValue=freqValue;
			}
		}
		findTheMostFrequentElement(root.right); 
	}

}
