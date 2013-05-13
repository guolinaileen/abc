  	printAllSequence(0, 3, 3, array ); 

	public static void printAllSequence(int index, int k, int num, int[] array )
	{
		if(k==0)
		{
			print(array); return ; 
		}
		for(int i=1; i<=num; i++)
		{
			array[index]=i;
			printAllSequence(index+1, k-1,  num, array );
		}
		
	}
	public static void print(int [] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println("");
	}


/* The core function that generates and prints all sequences of length k */
void printSeqRecur(int num, int pos, int k, int n)
{
    if (pos == k) {
        System.out.println(num);
        return;
    }
    for (int i = 1; i <= n; i++) {
        printSeqRecur(num * 10 + i, pos + 1, k, n);
    }
}
 
/* A function that uses printSequencesRecur() to prints all sequences
   from 1, 1, ..1 to n, n, ..n */
void printSequences(int k, int n)
{
    printSeqRecur(0, 0, k, n);
}
