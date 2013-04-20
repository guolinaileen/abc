public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result=new ArrayList<String>();
        address(0, "", s, result);
        return result;
    }
    void address(int count, String sForm, String rest, ArrayList<String> result)
    {
        if(count==4)
        {
            if(rest.equals("")) result.add(sForm.substring(0, sForm.length()-1)); 
            return ;
        }
        if(rest.equals("")) return ;
        if(rest.charAt(0)=='0')
        {
            address(count+1, sForm+"0.", rest.substring(1), result);
            return ;
        }
        address(count+1, sForm+rest.charAt(0)+".", rest.substring(1), result);
        if(rest.length()>=2) 
        address(count+1, sForm+rest.substring(0, 2)+".", rest.substring(2), result);
        if(rest.length()>=3)
        {
            int num=Integer.parseInt(rest.substring(0, 3));
            if(num<=255)
            {
                address(count+1, sForm+rest.substring(0, 3)+".", rest.substring(3), result);   
            }
        }
    }
}
