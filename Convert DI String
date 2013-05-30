  public static String converDIstring(String target)
	{
		int last=1;
		StringBuffer sb=new StringBuffer(); 
		for(int i=0; i<target.length(); i++)
		{
			if(target.charAt(i)=='I')
			{
				sb.append(reverse(last, i+1));
				last=i+2; 
			}
		}
		sb.append(reverse(last, target.length()+1));
		return sb.toString(); 
	}
	public static String reverse(int start, int end)
	{
		StringBuffer sb=new StringBuffer(); 
		for(int i=end; i>=start; i--)
		{
			sb.append(i);
		}
		return sb.toString();
	}
