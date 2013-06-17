  public static int findBlock( int [][] matrix)
	{
		if(matrix.length==0) return 0; 
		boolean [][] checker=new boolean [matrix.length][matrix[0].length];
		int result=0; 
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]==0 || checker[i][j]) continue; 
				checkOthers(matrix, checker, i, j);
				result++; 
			}
		}
		return result; 
	}

	public static void checkOthers(int [][] matrix, boolean [][] checker, int i, int j)
	{
		if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j]==0 || checker[i][j]==true) return ; 
		checker[i][j]=true; 
		checkOthers(matrix, checker, i+1, j);
		checkOthers(matrix, checker, i-1, j);
		checkOthers(matrix, checker, i, j-1);
		checkOthers(matrix, checker, i, j+1);
	}
