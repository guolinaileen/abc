  	int[] arr=new int [9]; 
		findLangford(arr, 4); 

	public static void findLangford(int[] arr, int n) {
        if (n == 0) {
            for (int i = 0; i< arr.length;i++)
                System.out.print(arr[i] + " ");
            System.out.print("\n");
            return;
        }
        for (int i=0;i<arr.length-n-1;i++) {
            if(arr[i] == 0 && arr[i+n+1] == 0) { //empty slot
                arr[i] = n; arr[i+n+1] = n;
                findLangford(arr, n-1);
                arr[i] = 0; arr[i+n+1] = 0; //undo
            }
        }
    }
