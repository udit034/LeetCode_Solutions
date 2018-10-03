public class Trie {
    
    TrieNode head = null;

    class TrieNode
    {
        HashMap< String, TrieNode> a = new HashMap< String, TrieNode>();
        char val = '#';
        boolean Final = false;
        public TrieNode( HashMap<String, TrieNode> a, char val, boolean Final )
        {
            this.a = a;
            this.val = val;
            this.Final = Final;
        }
    }
    /** Initialize your data structure here. */
    public Trie() {
        head = null;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode n = head;
        for( int c = 0; c < word.length(); c++ )
        {
            char cur = word.charAt(c);
            String curS = String.valueOf( cur );
            if( n == null )
            {
                n = new TrieNode( new HashMap< String, TrieNode>(), cur, false );
                head = n;
                n.a.put( curS, new TrieNode( new HashMap< String, TrieNode>(), cur, false ) );
                n = n.a.get( curS );
            }
            else
            {
                if( n.a.containsKey( curS ) )
                    n = n.a.get( curS );
                else
                {
                    n.a.put( curS, new TrieNode( new HashMap< String, TrieNode>(), cur, false ) );
                    n = n.a.get( curS );
                }
            }
            if( c == word.length() - 1 )
                n.Final = true;
        }
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        System.out.println( "SEARCHING " + word );
        TrieNode n = head;
        for( int c = 0; c < word.length(); c++ )
        {
            String curS = String.valueOf( word.charAt(c)  );
            if( n == null )
                return false;
            else
            {
                System.out.println( curS + " in keys of " + n.val );
                if( n.a.containsKey( curS ) ) 
                        n = n.a.get( curS );    
                else
                    return false;
            }
        }
        return n.Final;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode n = head;
        for( int c = 0; c < prefix.length(); c++ )
        {
            String curS = String.valueOf( prefix.charAt(c) );
            if( n == null )
                return false;
            else
            {
                if( n.a.containsKey( curS ) )
                    n = n.a.get( curS );
                else
                    return false;
            }
        }
        return ( n.Final || n.a.size() > 0 );
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */