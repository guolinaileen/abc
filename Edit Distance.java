public class Solution {
    public int minDistance(String word1, String word2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m=word1.length()+1;
        int n=word2.length()+1;
        int array[][]=new int[m][n];
        //initilize the boundary cases
        for(int i=word1.length(); i>=0; i--)
        {
            array[i][word2.length()]=word1.length()-i;
        }
        for(int j=word2.length(); j>=0; j--)
        {
            array[word1.length()][j]=word2.length()-j;
        }
        for(int i=m-2; i>=0; i--)
        {
            for(int j=n-2; j>=0; j--)
            {
                if(word1.charAt(i)==word2.charAt(j))
                {
                    array[i][j]=array[i+1][j+1];
                }else
                {
                    array[i][j]=1+Math.min(array[i+1][j], Math.min(array[i][j+1], array[i+1][j+1]));
                }
            }
        }
        return array[0][0];
    }
}
