public class Solution {
    public static int ladderLength(String start, String end, HashSet<String> dict) {
            // Start typing your Java solution below
          // DO NOT write main() function
	    if(start.length()!=end.length()) return 0; 
	    if(start.compareTo("")==0) return 1; 
	    ArrayList<String> newStart=new ArrayList<String>();
	    newStart.add(start);
		int distance=1; 
		ArrayList<String> nextStart=new ArrayList<String>();
	    for(int index=0; index<newStart.size() && dict.size()>0; index++  )
	    {	    	
	        String current=newStart.get(index);        
	        for(int i=0; i<current.length(); i++)
	        {
			    for(char j='a'; j<='z'; j++)
			    {
	        		if(current.charAt(i)==j) continue; 
	        		String temp=current.substring(0, i)+j+current.substring(i+1);        		
				    if(temp.equals(end)) return distance+1; 
				    if(dict.contains(temp))
				    {
	                    nextStart.add(temp);
	                    dict.remove(temp);
	    		    }
			    }
		    }
	        if(index==newStart.size()-1)
	        {
	            newStart.addAll(new ArrayList<String>(nextStart));
	            nextStart=new ArrayList<String>();
	            distance++; 
	        }
	    }
		return 0; 
	    }
}
