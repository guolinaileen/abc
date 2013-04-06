public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String [] arrays=new String[10];
        arrays[2]="abc"; 
        arrays[3]="def";
        arrays[4]="ghi";
        arrays[5]="jkl";
        arrays[6]="mno";
        arrays[7]="pqrs";
        arrays[8]="tuv";
        arrays[9]="wxyz";
        ArrayList<String> result=new ArrayList<String>();
        result.add("");
        if(digits.length()==0) return result; 
        for(int i=0; i<digits.length(); i++ )
        {
            String num=arrays[digits.charAt(i)-'0']; 
            ArrayList<String> tempResult=new ArrayList<String>(); 
            for(String s:result)
            {
               for(int j=0; j<num.length(); j++)
               {
                tempResult.add(s+num.charAt(j));
               }   
            }
            result=tempResult; 
        }
        return result; 
    }
}
