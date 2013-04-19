import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;



public class Lookout {
     static class Node
	   {
		   int index;  
		   String detail; 
		   Node(int id, String d)
		   {
			   index=id; 
			   detail=d; 
		   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transferString("src/test.txt");
	}
	   static public void transferString(String name)
	   {	   
		   try
		   {
			   FileInputStream fstream=new FileInputStream(name);
			   DataInputStream in=new DataInputStream(fstream);
			   BufferedReader br=new BufferedReader(new InputStreamReader(in));
			   String strLine; 
			   //read each line
			   while((strLine=br.readLine())!=null)
			   {
				   String s[]=strLine.split(";");
				   //if it doesn't contains only one semicolon, an error exist in this line
				   if(s.length!=2) continue; 
				   //split all stings
				   String match[]=s[1].split(",");
				   //if the list of strings are not even, an error exist in this line
				   if(match.length%2!=0) continue; 
				   //as requirements, print out the string after substitutions have been made
				   System.out.println(preProcess(s[0], match));
			   }
		   }catch(Exception e)
		   {
			   System.err.println(e.getMessage());
		   }
	   }
	   
	   static public String preProcess(String target, String [] match)
	   {
		   if(target.length()==0) return target; 
		  HashMap<String, String> map=new HashMap<String, String>();
		  /*
		   * create two arraylists, one, called result, stores the pattern we met in the target
		   * another one, called waiting, stores the substring we can match in the following iterations. 
		  */
		  ArrayList<Node> waiting=new ArrayList<Node>();
		  waiting.add(new Node(0, target));
		  ArrayList<Node> result=new ArrayList<Node>();
		  for(int i=0; i<match.length; i=i+2)
		  {
			  map.put(match[i], match[i+1]);
			  findPattern(waiting, result, match[i]);
		  }
		  //add all the rest of string into the result list
		  result.addAll(waiting);
		  //create a comparator to compare the strings' index, so we get a list of strings based on their index
		  Comparator<Node> comp=new Comparator<Node>()
				  {
			 public int compare(Node a, Node b)
			  {
				  return new Integer(a.index).compareTo(new Integer(b.index));
			  }
				  }; 
		  Collections.sort(result, comp);
		  StringBuffer sb=new StringBuffer();
		  for(int i=0; i<result.size(); i++)
		  {
			  if(map.containsKey(result.get(i).detail))
			  {
				  sb.append(map.get(result.get(i).detail));
			  }else
			  {
				  sb.append(result.get(i).detail);
			  }
		  }
		  return sb.toString();
	   }
	   
	   static public void findPattern(ArrayList<Node> waiting, ArrayList<Node> result, String pattern )
	   {
		   ArrayList<Node> newSubString=new ArrayList<Node>();
		   for(int i=0; i<waiting.size(); i++)
		   {
			   String target=waiting.get(i).detail;
			   if(target.length()<pattern.length()) continue; 
			   int pre=0; //relative index
			   int index=waiting.get(i).index; //real first letter index
			   boolean change=false;
			   for(int j=0; j<=target.length()-pattern.length(); )
			   {
				   if(pattern.compareTo(target.substring(j, j+pattern.length()))==0)
				   {
					   change=true; 
					   result.add(new Node(index+j, pattern));
					   if(pre<j) newSubString.add(new Node(index+pre, target.substring(pre, j)));
					   pre=j+pattern.length();
					   j+=pattern.length();
					   continue; 
				   }
				   j++; 
			   }
			   //if target has been changed, we have to remove this element in the waiting list
			   if(change)
			   {
				   if(pre<target.length()) newSubString.add(new Node(index+pre,target.substring(pre)));
				   waiting.remove(i);
				   i--; 
			   }
		   }
		   //if newSubString contains new string, add all of them into waiting list. 
		   if(newSubString.size()!=0)
		   {
			   waiting.addAll(newSubString);
		   }
	   }

}
