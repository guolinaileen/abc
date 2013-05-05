public class Solution {
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>() ;
        ladderLength(start,  end, dict, result);
        return result; 
    }
    
    public void ladderLength(String start, String end, HashSet<String> dict, ArrayList<ArrayList<String>> result) 
    {
            // Start typing your Java solution below
          // DO NOT write main() function
        if(start.length()!=end.length()) return ; 
      ArrayList<String> newStart=new ArrayList<String>();
	    newStart.add(start);
        boolean flag=false;
        ArrayList<ArrayList<String>> tempResult=new  ArrayList<ArrayList<String>>(); 
        tempResult.add(newStart);
        ArrayList<ArrayList<String>> subtempResult=new  ArrayList<ArrayList<String>>(); 
	    for(int index=0; index<tempResult.size(); index++  )
	    {	
            newStart=tempResult.get(index);
	        String current=newStart.get(newStart.size()-1);        
	        for(int i=0; i<current.length(); i++)
	        {
			    for(char j='a'; j<='z'; j++)
			    {
	        		if(current.charAt(i)==j) continue; 
	        		String temp=current.substring(0, i)+j+current.substring(i+1);        		
				    if(temp.equals(end))
                    {
                        newStart.add(temp);
                        result.add(new ArrayList<String>(newStart));
                        newStart.remove(newStart.size()-1);
                        flag=true; 
                        continue; 
                    }
				    if(dict.contains(temp) && !newStart.contains(temp))
				    {
	                    newStart.add(temp);
                        subtempResult.add(new ArrayList<String>(newStart));
                        newStart.remove(newStart.size()-1);
	    		    }
			    }
		    }
	        if(index==tempResult.size()-1)
	        {
                if(flag) break; 
                tempResult=new ArrayList<ArrayList<String>>(subtempResult); 
                subtempResult.clear();
                index=-1; 
	        }
	    }
	}
}
