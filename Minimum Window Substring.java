public class Solution {
    public String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(T.length()==0) return T;
        if(S.length()==0) return S; 
        String result="";
        int minWindowSize=Integer.MAX_VALUE;
        int [] needToFind=new int[256];
        for(int i=0; i<T.length(); i++)
        {
            needToFind[T.charAt(i)]++;
        }
        int [] found=new int[256];
        int count=0;
        int start=0;
        for(int i=0; i<S.length(); i++)
        {
            if(needToFind[S.charAt(i)]==0) continue;
            found[S.charAt(i)]++;
            if(found[S.charAt(i)]<=needToFind[S.charAt(i)])
            count++; 
            if(count==T.length())
            {
                while(needToFind[S.charAt(start)]==0||needToFind[S.charAt(start)]<found[S.charAt(start)])
                {
                    if(needToFind[S.charAt(start)]<found[S.charAt(start)])
                    {
                        found[S.charAt(start)]--; 
                    }
                    start++;
                }
                if(i+1-start<minWindowSize)
                {
                    minWindowSize=i+1-start; 
                    result=S.substring(start,i+1);
                }
            }
        }
        return result;
    }
}
