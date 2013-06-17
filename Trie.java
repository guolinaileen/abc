  static class TrieNode
    {
        char index; 
        HashMap<Character, TrieNode> map; 
        boolean isEnd; 
        TrieNode(char i)
        {
            index=i; 
            map=new HashMap<Character, TrieNode>(); 
            isEnd=false; 
        }
    }
	static class Trie
    {
        TrieNode root; 
        Trie(TrieNode r)
        {
        	root=r; 
        }
        public void insert(String s)
        {
            TrieNode crawl=root;
            for(int i=0; i<s.length(); i++)
            {
            	HashMap<Character, TrieNode> rootMap=crawl.map; 
                if(rootMap.containsKey(s.charAt(i)))
                {
                    crawl=rootMap.get(s.charAt(i)); 
                }else
                {
                    TrieNode node=new TrieNode(s.charAt(i));
                    rootMap.put(s.charAt(i), node);
                    crawl=node; 
                }
            }
            crawl.isEnd=true; 
        }
    }
