  public static void allPermutation(String target, String formed, int n)
	{
		if(n==target.length()) 
		{
			System.out.println(formed); return ;
		}
		for(int i=0; i<target.length(); i++)
		{
			allPermutation(target, formed+target.charAt(i), n+1);
		}
	}
