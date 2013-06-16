class TrieNode {           
    public TrieNode(char ch)  {
        value = ch;
        children = new HashMap<>();
        bIsEnd = false;
    }    
    public HashMap<Character,TrieNode> getChildren() {   return children;  }    
    public char getValue()                           {   return value;     }    
    public void setIsEnd(boolean val)                {   bIsEnd = val;     }    
    public boolean isEnd()                           {   return bIsEnd;    }
       
    private char value;    
    private HashMap<Character,TrieNode> children;
    private boolean bIsEnd;  
}
   
// Implements the actual Trie
class Trie {        
    // Constructor
    public Trie()   {     root = new TrieNode((char)0);       }    
   
    // Method to insert a new word to Trie
    public void insert(String word)  {
           
        // Find length of the given word
        int length = word.length();        
        TrieNode crawl = root;
           
        // Traverse through all characters of given word
        for( int level = 0; level < length; level++)
        {
            HashMap<Character,TrieNode> child = crawl.getChildren();            
            char ch = word.charAt(level);
               
            // If there is already a child for current character of given word 
            if( child.containsKey(ch))
                crawl = child.get(ch);
            else   // Else create a child
            {              
                TrieNode temp = new TrieNode(ch);
                child.put( ch, temp );
                crawl = temp;
            }
        }
           
        // Set bIsEnd true for last character
        crawl.setIsEnd(true);
    }
}
