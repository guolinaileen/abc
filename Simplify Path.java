public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list=new ArrayList<String>();
        String [] array=path.split("/");
        for(int i=0; i<array.length; i++)
        {
            if(array[i].length()==0||array[i].equals(".")) continue;
            if(array[i].equals(".."))
            {
                if(list.size()!=0)
                {
                    list.remove(list.size()-1); 
                }
                continue; 
            }
            list.add(array[i]);
        }
        StringBuffer sb=new StringBuffer();
        for(String s: list)
        {
            sb.append("/");
            sb.append(s);
        }
        return sb.length()==0? "/":sb.toString();
    }
}
